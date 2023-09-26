package testcase.end;

import com.codeborne.selenide.WebDriverRunner;
import common.InitDriver;
import common.data.DataProviderCsv;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.LoginPage;
import tikipage.LoginTikiPage;

import static com.codeborne.selenide.Selenide.open;
import static common.config.WebConfig.TIKI_PAGE_URL;

public class TestLoginTikiPage  extends InitDriver {
    @Test(dataProvider = "loginDataCsv", dataProviderClass = DataProviderCsv.class, groups = "login")
    public void testcase2_login_to_tracker_csv(String username, String password) {
        open(TIKI_PAGE_URL);
        WebDriver driver = WebDriverRunner.getWebDriver();
        driver.manage().window().fullscreen();
        LoginTikiPage loginTikiPage = new LoginTikiPage(driver);
        loginTikiPage.loginWithMails(username, password);
        System.out.println(driver.getPageSource());
        Assert.assertTrue(driver.getPageSource().contains("Thông tin đăng nhập không đúng"), "Hệ thống chưa validate ");


    }
}
