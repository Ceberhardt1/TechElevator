package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.exception.DaoException;
import com.techelevator.projects.model.Department;

public class JdbcDepartmentDao implements DepartmentDao {

	private final String DEPARTMENT_SELECT = "SELECT d.department_id, d.name FROM department d ";
	
	private final JdbcTemplate jdbcTemplate;

	public JdbcDepartmentDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Department getDepartmentById(int id) {
		Department department = null;
		String sql = DEPARTMENT_SELECT +
				" WHERE d.department_id=?";

		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, id);
		if (results.next()) {
			department = mapRowToDepartment(results);
		}

		return department;
	}

	@Override
	public List<Department> getDepartments() {
		List<Department> departments = new ArrayList<>();
		String sql = DEPARTMENT_SELECT;

		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while (results.next()) {
			departments.add(mapRowToDepartment(results));
		}
		
		return departments;
	}

	@Override
	public Department createDepartment(Department department) {
		Department newDepartment = null;
		String sql = "INSERT INTO department (name) " +
					"VALUES (?) RETURNING department_id;" ;

		try{
			int newDepartId = jdbcTemplate.queryForObject(sql, int.class, department.getName());

			newDepartment = getDepartmentById(newDepartId);
		}catch(CannotGetJdbcConnectionException e){
			throw new DaoException("Unable to connect to server or database", e);
		}
		catch (DataIntegrityViolationException e) {
		throw new DaoException("Data integrity violation", e);
		}
        return newDepartment;

	}

	@Override
	public Department updateDepartment(Department department) {
		Department updatedDepartment = null;
		String sql = "UPDATE department SET name = ? " +
					"WHERE department_id = ?;";

		try{
			int numberOfRows = jdbcTemplate.update(sql, department.getName(), department.getId());

			if(numberOfRows == 0){
				throw new DaoException("Zero rows affected, expected at least one");
			}
			else{
				updatedDepartment = getDepartmentById(department.getId());
			}
		}
		catch (CannotGetJdbcConnectionException e) {
			throw new DaoException("Unable to connect to server or database", e);
		} catch (DataIntegrityViolationException e) {
			throw new DaoException("Data integrity violation", e);
		}
		return updatedDepartment;
	}

	@Override
	public int deleteDepartmentById(int departmentId) {
		int numberOfRows = 0;
		String sql = ("UPDATE employee SET department_id = 0 WHERE department_id = ?; ");
		String sql2 = "DELETE FROM department WHERE department_id = ?;";
		try {
			jdbcTemplate.update(sql, departmentId);
			numberOfRows = jdbcTemplate.update(sql2, departmentId);
		} catch (CannotGetJdbcConnectionException e) {
			throw new DaoException("Unable to connect to server or database", e);
		} catch (DataIntegrityViolationException e) {
			throw new DaoException("Data integrity violation", e);
		}
		return numberOfRows;
	}

	private Department mapRowToDepartment(SqlRowSet results) {
		Department department = new Department();
		department.setId(results.getInt("department_id"));
		department.setName(results.getString("name"));
		return department;
	}

}
