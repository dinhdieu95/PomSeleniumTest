package testcase;

import com.codeborne.selenide.WebDriverRunner;
import common.Common;
import common.data.DataProviderClass;
import common.data.DataProviderCsv;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import page.LoginPage;

import static com.codeborne.selenide.Selenide.open;
import static common.Common.getSource;

public class LogInTest {
    @BeforeGroups("login")
    public void beforeGroup() {
        System.out.println("Khoi tao khi bat dau group");
    }

    @AfterGroups("login")
    public void afterGroup() {
        System.out.println("ket thuc group");
    }

    @BeforeTest
    void openTestPage() {
        open(getSource() + "page_with_selects_without_jquery.html");
    }

    @Test(dataProvider = "loginData", dataProviderClass = DataProviderClass.class)
    public void testcase2_login_to_tracker(String username, String password, String password2) {
        System.out.println(username + password + "\b" + password2);
        WebDriver driver = WebDriverRunner.getWebDriver();
        LoginPage loginPage = new LoginPage(driver);
        Common.wait(driver, 10);
        loginPage.enterUsername(username);
        loginPage.enterPass(password);
        loginPage.clickLogin();
    }

    @Test(dataProvider = "loginDataCsv", dataProviderClass = DataProviderCsv.class, groups = "login")
    public void testcase2_login_to_tracker_csv(String username, String password) {
        System.out.println(username + password);
        WebDriver driver = WebDriverRunner.getWebDriver();
        LoginPage loginPage = new LoginPage(driver);
        Common.wait(driver, 10);
        loginPage.enterUsername(username);
        loginPage.enterPass(password);
        loginPage.clickLogin();
    }

    @AfterTest
    void after() {
        WebDriverRunner.getWebDriver().quit();
    }
}
