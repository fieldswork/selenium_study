package com.demoqa.pages.widgets;

import static utilities.DropDownUtility.selectByVisibleText;

import org.openqa.selenium.By;

public class DatePickerMenuPage extends WidgetsPage {

    private By selectDateField = By.id("datePickerMonthYearInput");
    private By dayDropDown = By.className("react-datepicker__day-select");
    private By monthDropDown = By.className("react-datepicker__month-select");
    private By yearDropDown = By.className("react-datepicker__year-select");
    // Another way to locate this would be by using By.cssSelector(".react-datepicker__year-select");
    //                                                              ^ The dot is a shortcut for CSS
    
    public boolean isDayInMonth(String day) {
        return find(dayValue(day)).isDisplayed();
    }

    public void clickDay(String day) {
        click(dayValue(day));
    }

    private By dayValue(String day) {
        return By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day--')][text()='" + day +"']");
    }

    public void clickSelectDate() {
        click(selectDateField);
    }

    public String getDate() {
        return find(selectDateField).getAttribute("value"); // Value attribute contains the date formatted mm/dd/yyyy
    }

    public void selectMonth(String month) {
        selectByVisibleText(monthDropDown, month);
    }

    public void selectYear(String year) {
        selectByVisibleText(yearDropDown, year);
    }
}
