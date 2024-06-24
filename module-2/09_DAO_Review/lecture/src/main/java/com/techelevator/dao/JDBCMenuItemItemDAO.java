package com.techelevator.dao;

import com.techelevator.exception.DaoException;
import com.techelevator.model.MenuItem;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JDBCMenuItemItemDAO implements MenuItemDAO {
    //4). create template (jdbc)
    private final JdbcTemplate jdbcTemplate;

    // 3). create constructor that recieves the datasource
    public JDBCMenuItemItemDAO (DataSource dataSource){
        //5 instantiate the template
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }



    @Override
    public MenuItem retrieveMenuItemById(int id) {
        return null;
    }

    @Override
    public MenuItem retrieveMenuItemByName(String name) {
        return null;
    }

    @Override
    public List<MenuItem> retrieveMenuItems() {
        List<MenuItem> menuItems = new ArrayList<>();
        String sql = "SELECT menu_items.id, menu_items.name AS menu_item_name, description, price, categories.name AS category_name FROM menu_items  " +
        "JOIN categories ON menu_items.category_id = categories.id ;" ;
        try{
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql); //your results

            while(results.next()){ // go through
                menuItems.add(mapRowToMenuItem(results));
            }
        }
        catch(CannotGetJdbcConnectionException e){
            throw new DaoException("Unable to connect to server or database", e); //throw exception
        }
        return menuItems;
    }

    @Override
    public MenuItem createMenuItem(MenuItem newItem) {
        return null;
    }

    @Override
    public MenuItem updateMenuItem(MenuItem itemToUpdate) {
        return null;
    }

    @Override
    public void deleteMenuItem(int menuId) {

    }

    private MenuItem mapRowToMenuItem(SqlRowSet sqlRowSet){
        MenuItem menuItem = new MenuItem();
    }
}