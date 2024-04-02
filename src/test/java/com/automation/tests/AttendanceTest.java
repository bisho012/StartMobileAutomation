package com.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class AttendanceTest extends TestBase {
    @Test(priority=1)
    public void SickLeave() {
        loginPage.setUsername("3458");
        loginPage.setPassword("actst2023");
        loginPage.clickLogin();
        Assert.assertEquals("Binoy .A", homePage.getEmployeeName());
        homePage.clickAttendance();
        Assert.assertEquals("Attendance",attendancePage.getAttendanceLabel());
        attendancePage.clickLastMonth();
        attendancePage.clickLastMonth();
        attendancePage.clickSickLeaveDay();
        Assert.assertEquals("Sick Leave",attendancePage.getSickLeaveLabel());
    }
    @Test(priority=2)
    public void Done() {
        loginPage.setUsername("3458");
        loginPage.setPassword("actst2023");
        loginPage.clickLogin();
        Assert.assertEquals("Binoy .A", homePage.getEmployeeName());
        homePage.clickAttendance();
        Assert.assertEquals("Attendance",attendancePage.getAttendanceLabel());
        attendancePage.clickLastMonth();
        attendancePage.clickLastMonth();
        attendancePage.clickDoneDay();
        Assert.assertEquals("Done",attendancePage.getDoneLabel());
    }

    @Test(priority=3)
    public void Missed() {
        loginPage.setUsername("3458");
        loginPage.setPassword("actst2023");
        loginPage.clickLogin();
        Assert.assertEquals("Binoy .A", homePage.getEmployeeName());
        homePage.clickAttendance();
        Assert.assertEquals("Attendance",attendancePage.getAttendanceLabel());
        attendancePage.clickLastMonth();
        attendancePage.clickLastMonth();
        attendancePage.clickMissedDay();
        Assert.assertEquals("Missed",attendancePage.getMissedLabel());
    }

    @Test(priority=4)
    public void Leave() {
        loginPage.setUsername("3458");
        loginPage.setPassword("actst2023");
        loginPage.clickLogin();
        Assert.assertEquals("Binoy .A", homePage.getEmployeeName());
        homePage.clickAttendance();
        Assert.assertEquals("Attendance",attendancePage.getAttendanceLabel());
        attendancePage.clickLastMonth();
        attendancePage.clickLastMonth();
        attendancePage.clickLastMonth();
        attendancePage.clickLeaveDay();
        Assert.assertEquals("Leave",attendancePage.getLeaveLabel());
    }
}
