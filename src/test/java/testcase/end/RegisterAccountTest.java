package testcase.end;

import com.codeborne.selenide.WebDriverRunner;
import common.InitDriver;
import common.data.DataProviderCsv;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import tikipage.LoginTikiPage;

import static com.codeborne.selenide.Selenide.open;
import static common.config.WebConfig.TIKI_PAGE_URL;

public class RegisterAccountTest extends InitDriver {
    @Test(dataProvider = "regDataCsv", dataProviderClass = DataProviderCsv.class)
    public void testcase2_login_to_tracker_csv(String phone) {
        open(TIKI_PAGE_URL);
        WebDriver driver = WebDriverRunner.getWebDriver();
        driver.manage().window().fullscreen();
        LoginTikiPage loginTikiPage = new LoginTikiPage(driver);
        loginTikiPage.loginOrRegWithPhone(phone);
    }
}
