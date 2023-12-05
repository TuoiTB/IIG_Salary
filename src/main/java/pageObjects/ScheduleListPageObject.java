package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUI.LoginPageUI;

public class ScheduleListPageObject extends BasePage {
    WebDriver driver;

    public ScheduleListPageObject(WebDriver driver) {
        this.driver = driver;
    }

}
