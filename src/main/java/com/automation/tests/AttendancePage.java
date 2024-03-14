package com.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AttendancePage extends PageBase{
    public AttendancePage(WebDriver driver) {
        super(driver);
    }

    public By lblAttendance = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[1]");
    public By btnLastMonth = By.xpath("//android.widget.SeekBar[@content-desc=\"MON, TUE, WED, THU, FRI, SAT, SUN\"]/android.view.ViewGroup[2]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView");
    public By btnSickLeave = By.xpath("//android.widget.Button[@content-desc=\" Tuesday 16 January 2024 You have entries for this day \"]/android.widget.TextView");
    public By btnDone = By.xpath("//android.widget.Button[@content-desc=\" Thursday 18 January 2024 You have entries for this day \"]/android.widget.TextView");
    public By lblSickLeave = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[9]/android.widget.TextView[1]");
    public By lblDone = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[9]/android.widget.TextView[1]");
    public String getAttendanceLabel(){
        waitElement(lblAttendance);
        return getContent(lblAttendance);
    }
    public void clickLastMonth(){
        click(btnLastMonth);
    }
    public void clickSickLeaveDay(){
        click(btnSickLeave);
    }
    public String getSickLeaveLabel(){
        waitElement(lblSickLeave);
        return getContent(lblSickLeave);
    }

    public void clickDoneDay(){
        click(btnDone);
    }

    public String getDoneLabel(){
        waitElement(lblDone);
        return getContent(lblDone);
    }
}