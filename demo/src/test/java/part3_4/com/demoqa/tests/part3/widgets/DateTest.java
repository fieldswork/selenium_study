package part3_4.com.demoqa.tests.part3.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;

import part3_4.com.demoqa.base.BaseTest;

public class DateTest extends BaseTest {

    @Test
    public void testSelectingDate() {
        String month = "December";
        String day = "31";
        String year = "2034";

        var datePickerPage = homePage.gotoWidgets().clickDatePicker();
        datePickerPage.clickSelectDate();
        datePickerPage.selectMonth(month);
        datePickerPage.selectYear(year);
        datePickerPage.clickDay(day);

        String actualDate = datePickerPage.getDate();
        String expectedDate = month + "/" + day + "/" + year;
        Assert.assertEquals(actualDate, expectedDate, "\n Actual (" + actualDate + ") and expected (" + expectedDate + ") dates do not match \n");
    }
}
