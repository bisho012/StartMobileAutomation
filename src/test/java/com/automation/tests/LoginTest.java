package com.automation.tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends TestBase {

    @Test(priority=1)
    public void ValidLogin() throws IOException, InterruptedException {
        loginPage.setUsername("3458");
        loginPage.setPassword("actst2023");
        loginPage.clickLogin();
        Assert.assertEquals("Binoy .A", homePage.getEmployeeName());
    }

    @Test(priority=2)
    public void InvalidLogin() throws IOException, InterruptedException {
        loginPage.setUsername("3058");
        loginPage.setPassword("actst2023");
        loginPage.clickLogin();
        Assert.assertEquals("Request failed with status code 503", loginPage.getErrorMsg());
    }

    @Test(priority=3)
    public void PressSafety() throws IOException, InterruptedException {
        loginPage.setUsername("3458");
        loginPage.setPassword("actst2023");
        loginPage.clickLogin();
        Assert.assertEquals("Binoy .A", homePage.getEmployeeName());
        homePage.clickSafety();
        Thread.sleep(25000);
    }

}