package Bussiness;

import commons.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.*;

@Epic("Bussiness")
@Feature("Schedule")
public class Schedule extends BaseTest {

    private WebDriver driver;
    private String userNameLogin;
    private String passwordLogin;
    @Parameters({"browser","url"})
    @BeforeClass
    public void beforeClass(String browserName, String url) {
        userNameLogin = "admin";
        passwordLogin = "12345";
        driver = getBrowserDriver(browserName, url);
        loginPage = PageGeneratorManager.getLoginPage(driver);
        loginPage.loginToSystem(userNameLogin,passwordLogin);
        userNameLogin = "admin";
        passwordLogin = "12345";
    }
    @Description("TC_01")
    @Test
    public void Schedule_01_Add_Schedule(){
        log.info("Schedule_01 - Step 01 : Open dashboard page");
        dashBoardPage = PageGeneratorManager.getDashBoardPage(driver);

        log.info("Schedule_01 - Step : Open Schedule page");
        log.info("Schedule_01 - Step : ");
        log.info("Schedule_01 - Step : ");
        log.info("Schedule_01 - Step : ");
        log.info("Schedule_01 - Step : ");
        log.info("Schedule_01 - Step : ");
        log.info("Schedule_01 - Step : ");
        log.info("Schedule_01 - Step : ");

    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        //quitBrowserDriver();
    }

    LoginPageObject loginPage;
    DashBoardPageObject dashBoardPage;

}
