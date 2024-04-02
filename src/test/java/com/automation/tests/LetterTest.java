package com.automation.tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LetterTest extends TestBase {
    Faker faker = new Faker();
    @Test(priority=1)
    public void openLetterModule() {
        loginPage.setUsername("3458");
        loginPage.setPassword("actst2023");
        loginPage.clickLogin();
        Assert.assertEquals("Binoy .A", homePage.getEmployeeName());
        homePage.clickLetter();
        Assert.assertEquals("Letters",letterPage.getLettersLabel());
    }

    @Test(priority=1)
    public void requestBankLetterSalaryCertificateType() {
        openLetterModule();
        letterPage.clickAdd();
        letterPage.clickBankLetter();
        bankLetterPage.clickLetterType();
        bankLetterPage.clickSalaryCertificate();
        bankLetterPage.clickApply();
        bankLetterPage.clickBankName();
        bankLetterPage.clickDhabiCommBank();
        bankLetterPage.clickApply();
        bankLetterPage.setAccountNumber("123456789012345678901234567890");
        bankLetterPage.setLoanAmount(faker.numerify("235000"));
        bankLetterPage.setComment("testing comment");
        bankLetterPage.clickSubmit();
        bankLetterPage.waitPageToLoad();
        Assert.assertTrue(bankLetterPage.isSuccessMsgDisplayed());
        Assert.assertEquals("Request \n" +
                " submitted!", bankLetterPage.getSuccessMsg());
        bankLetterPage.clickGoToDashboard();
        Assert.assertEquals("Binoy .A", homePage.getEmployeeName());
    }

}
