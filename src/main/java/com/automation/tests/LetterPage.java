package com.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.page.Page;

public class LetterPage extends PageBase {
    public LetterPage(WebDriver driver) {
        super(driver);
    }

    private final By lblLetters = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[1]");
    private final By btnAdd = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView");
    private final By btnBankLetter = By.xpath("//android.view.ViewGroup[@content-desc=\"Bank Letter\"]/android.widget.TextView");
    private final By btnConsulateLetter = By.xpath("//android.view.ViewGroup[@content-desc=\"Consulate Letter\"]");
    private final By btnOtherLetter = By.xpath("//android.view.ViewGroup[@content-desc=\"Other Letter\"]/android.widget.TextView");

    public String getLettersLabel(){
        waitElement(lblLetters);
        return getContent(lblLetters);
    }

    public void clickAdd(){
        click(btnAdd);
    }

    public void clickBankLetter(){
        click(btnBankLetter);
    }

    public void clickConsulateLetter(){
        click(btnConsulateLetter);
    }

    public void clickOtherLetter(){
        click(btnOtherLetter);
    }
}
