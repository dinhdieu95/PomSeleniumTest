package testcase;

import com.codeborne.selenide.WebDriverRunner;
import common.InitDriver;
import common.data.DataProviderCsv;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import page.LoginPage;

import static com.codeborne.selenide.Selenide.open;

public class LoginPageTest extends InitDriver {
    private int index;

    public LoginPageTest(int index) {
        this.index = index;
        new InitDriver();
    }

    @Test(dataProvider = "loginDataCsv", dataProviderClass = DataProviderCsv.class, groups = "login")
    public void testcase2_login_to_tracker_csv(String username, String password) {
        System.out.println("Line:  " + index);
        open("https://www.browserstack.com/users/sign_in");
        WebDriver driver = WebDriverRunner.getWebDriver();
        driver.manage().window().fullscreen();
//        super.getDriver().get("https://www.browserstack.com/users/sign_in");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername(username);
        loginPage.enterPass(password);
        loginPage.clickLogin();

    }
}
