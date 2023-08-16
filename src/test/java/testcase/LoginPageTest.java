package testcase;

import common.InitDriver;
import common.data.DataProviderCsv;
import org.testng.annotations.Test;
import page.LoginPage;

public class LoginPageTest extends InitDriver {

    @Test(dataProvider = "loginDataCsv", dataProviderClass = DataProviderCsv.class, groups = "login")
    public void testcase2_login_to_tracker_csv(String username, String password){
        super.getDriver().get("https://www.browserstack.com/users/sign_in");
        LoginPage loginPage = new LoginPage(super.getDriver());
        loginPage.enterUsername(username);
        loginPage.enterPass(password);
        loginPage.clickLogin();

    }
}
