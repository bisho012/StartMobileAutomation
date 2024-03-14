package com.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class AttendanceTest extends TestBase{
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
}
