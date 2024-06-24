package com.techelevator.projects.dao;

import com.techelevator.projects.model.Timesheet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Time;
import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.assertNotNull;

public class JdbcTimesheetDaoTests extends BaseDaoTests {

    private static final Timesheet TIMESHEET_1 = new Timesheet(1, 1, 1,
            LocalDate.parse("2021-01-01"), 1.0, true, "Timesheet 1");
    private static final Timesheet TIMESHEET_2 = new Timesheet(2, 1, 1,
            LocalDate.parse("2021-01-02"), 1.5, true, "Timesheet 2");
    private static final Timesheet TIMESHEET_3 = new Timesheet(3, 2, 1,
            LocalDate.parse("2021-01-01"), 0.25, true, "Timesheet 3");
    private static final Timesheet TIMESHEET_4 = new Timesheet(4, 2, 2,
            LocalDate.parse("2021-02-01"), 2.0, false, "Timesheet 4");

    private JdbcTimesheetDao dao;
    private Timesheet testTimeSheet;


    @Before
    public void setup() {
        dao = new JdbcTimesheetDao(dataSource);
        testTimeSheet = new Timesheet(5, 2 , 1, LocalDate.now(), 2.0, true, "Timesheet 5");
    }

    @Test
    public void getTimesheetById_with_valid_id_returns_correct_timesheet() {
        Timesheet timesheet = dao.getTimesheetById(1);
        assertTimesheetsMatch(TIMESHEET_1, timesheet);

        timesheet = dao.getTimesheetById(2);
        assertTimesheetsMatch(TIMESHEET_2, timesheet);
    }

    @Test
    public void getTimesheetById_with_invalid_id_returns_null_timesheet() {
        Timesheet timesheet = dao.getTimesheetById(120);
        Assert.assertNull(timesheet);
    }

    @Test
    public void getTimesheetsByEmployeeId_with_valid_employee_id_returns_list_of_timesheets_for_employee() {
            List<Timesheet> timesheets = dao.getTimesheetsByEmployeeId(1);
            Assert.assertEquals(2, timesheets.size());
            assertTimesheetsMatch(TIMESHEET_2, timesheets.get(1));
            assertTimesheetsMatch(TIMESHEET_1, timesheets.get(0));

            timesheets = dao.getTimesheetsByEmployeeId(2);
            Assert.assertEquals(2, timesheets.size());
            assertTimesheetsMatch(TIMESHEET_3, timesheets.get(0));
            assertTimesheetsMatch(TIMESHEET_4, timesheets.get(1));

    }

    @Test
    public void getTimesheetsByEmployeeId_with_invalid_employee_id_returns_empty_list_of_timesheets() {
        List<Timesheet> timesheets = dao.getTimesheetsByEmployeeId(900);
        Assert.assertEquals(0,timesheets.size());
    }

    @Test
    public void getTimesheetsByProjectId_with_valid_project_id_returns_list_of_all_timesheets_for_project() {
        List<Timesheet> timesheets = dao.getTimesheetsByProjectId(1);
        Assert.assertEquals(3, timesheets.size());
        assertTimesheetsMatch(TIMESHEET_1, timesheets.get(0));
        assertTimesheetsMatch(TIMESHEET_2, timesheets.get(1));
        assertTimesheetsMatch(TIMESHEET_3, timesheets.get(2));


        timesheets = dao.getTimesheetsByProjectId(2);
        Assert.assertEquals(1, timesheets.size());
        assertTimesheetsMatch(TIMESHEET_4, timesheets.get(0));
    }

    @Test
    public void getTimesheetsByProjectId_with_invalid_project_id_returns_empty_list_of_timesheets() {
        List<Timesheet> timesheets = dao.getTimesheetsByProjectId(900);
        Assert.assertEquals(0,timesheets.size());
    }

    @Test
    public void createTimesheet_creates_timesheet() {
            Timesheet timesheet = dao.createTimesheet(testTimeSheet);
            Assert.assertNotNull(timesheet);

            int newId = timesheet.getTimesheetId();
            Assert.assertTrue(newId > 0);

            Timesheet retrievedTimeSheet = dao.getTimesheetById(newId);
            assertTimesheetsMatch(timesheet, retrievedTimeSheet);
    }

    @Test
    public void updateTimesheet_updates_timesheet() {
        Timesheet timesheetUpdate = dao.getTimesheetById(1);

        timesheetUpdate.setEmployeeId(10);
        timesheetUpdate.setProjectId(10);
        timesheetUpdate.setDateWorked(LocalDate.now());
        timesheetUpdate.setHoursWorked(4);
        timesheetUpdate.setBillable(false);
        timesheetUpdate.setDescription("Timesheet 10");

    }

    @Test
    public void deleteTimesheetById_deletes_timesheet() {
       int rowsAffected = dao.deleteTimesheetById(1);
       Assert.assertEquals(1,rowsAffected);

       Timesheet retrievedtimeSheet = dao.getTimesheetById(1);
       Assert.assertNull(retrievedtimeSheet);
    }

    @Test
    public void getBillableHours_returns_correct_total() {
        Double billable = dao.getBillableHours(1,1, true);
        Assert.assertEquals(1.0, billable, 0.001);

        billable = dao.getBillableHours(2,2, false);
        Assert.assertEquals(0.0, billable, 0.001);
    }

    private void assertTimesheetsMatch(Timesheet expected, Timesheet actual) {
        Assert.assertEquals(expected.getTimesheetId(), actual.getTimesheetId());
        Assert.assertEquals(expected.getEmployeeId(), actual.getEmployeeId());
        Assert.assertEquals(expected.getProjectId(), actual.getProjectId());
        Assert.assertEquals(expected.getDateWorked(), actual.getDateWorked());
        Assert.assertEquals(expected.getHoursWorked(), actual.getHoursWorked(), 0.001);
        Assert.assertEquals(expected.isBillable(), actual.isBillable());
        Assert.assertEquals(expected.getDescription(), actual.getDescription());
    }

}
