package com.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BankLetterPage extends PageBase{
    public BankLetterPage(WebDriver driver) {
        super(driver);
    }
    private final By btnLetterType = By.xpath("//android.view.ViewGroup[@content-desc=\"Select a reason\"]");
    private final By btnSalaryCertificate = By.xpath("//android.view.ViewGroup[@content-desc=\"Salary Certificate\"]/android.widget.TextView");
    private final By btnApply = By.xpath("//android.view.ViewGroup[@content-desc=\"Apply\"]/android.view.ViewGroup/android.view.View");
    private final By btnBankName = By.xpath("//android.view.ViewGroup[@content-desc=\"Select a bank\"]/android.widget.TextView");
    private final By btnDhabiCommBank = By.xpath("//android.view.ViewGroup[@content-desc=\"Dhabi Commercial Bank\"]");
    private final By txtAccountNumber = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.widget.EditText");
    private final By txtLoanAmount = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[4]/android.widget.EditText");
    private final By txtComment = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[6]/android.widget.EditText");
    private final By btnSubmit = By.xpath("//android.view.ViewGroup[@content-desc=\"Submit\"]/android.view.ViewGroup/android.view.View");
    private final By lblSuccessMsg = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView[1]");
    private final By btnGoToDashboard = By.xpath("\t//android.view.ViewGroup[@content-desc=\"Go to dashboard\"]/android.view.ViewGroup/android.view.View");
    public void clickLetterType(){
        click(btnLetterType);
    }
    public void clickSalaryCertificate(){
        click(btnSalaryCertificate);
    }
    public void clickApply(){
        click(btnApply);
    }
    public void clickBankName(){
        click(btnBankName);
    }
    public void clickDhabiCommBank(){
        click(btnDhabiCommBank);
    }
    public void setAccountNumber(String accountNumber){
        setText(txtAccountNumber, accountNumber);
    }
    public void setLoanAmount(String loanAmount){
        setText(txtLoanAmount, loanAmount);
    }
    public void setComment(String comment){
        setText(txtComment, comment);
    }
    public void clickSubmit(){
        click(btnSubmit);
    }
    public boolean isSuccessMsgDisplayed(){
        return isDisplayed(lblSuccessMsg);
    }
    public String getSuccessMsg(){
        return getContent(lblSuccessMsg);
    }
    public void clickGoToDashboard(){
        click(btnGoToDashboard);
    }

}
