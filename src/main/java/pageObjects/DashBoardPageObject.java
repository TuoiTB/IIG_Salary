package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUI.LoginPageUI;

public class DashBoardPageObject extends BasePage {
    WebDriver driver;

    public DashBoardPageObject(WebDriver driver) {
        this.driver = driver;
    }


}
