package testcase.example;
import java.util.concurrent.TimeUnit;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.reporters.EmailableReporter2;
import page.BrowserStackHomePage;
import page.BrowserStackSignUpPage;

import static com.codeborne.selenide.Selenide.open;
import static common.Common.CONFIG_DRIVER_CHROME;
import static common.Common.URL_SRC_CHROME;

public class BrowserStackSetupPOMTest extends EmailableReporter2 {
    WebDriver driver;
    BrowserStackHomePage objBrowserStackHomePage;
    BrowserStackSignUpPage objBrowserStackSignUpPage;

    @BeforeTest
    public void setup() {
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.browserstack.com/");
//        open("https://www.browserstack.com/");
//        driver = WebDriverRunner.getWebDriver();

    }

    @Test(priority = 1)
    public void navigate_to_homepage_click_on_getstarted() {
        objBrowserStackHomePage = new BrowserStackHomePage(driver);
        objBrowserStackHomePage.veryHeader();
        objBrowserStackHomePage.clickOnGetStarted();
    }

    @Test(priority = 2)
    public void enter_userDetails() {
        objBrowserStackSignUpPage = new BrowserStackSignUpPage(driver);
        objBrowserStackSignUpPage.veryHeader();
        objBrowserStackSignUpPage.enterFullName("TestUser");
        objBrowserStackSignUpPage.enterBusinessEmail("TestUser@gmail.com");
        objBrowserStackSignUpPage.enterPasswrod("TestUserPassword");
    }
    @AfterTest
    public void after(){
        driver.close();
    }
}
