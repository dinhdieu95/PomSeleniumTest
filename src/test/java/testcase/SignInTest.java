package testcase;

import common.InitDriver;
import org.testng.annotations.Test;
import page.LoginEPage;

public class SignInTest extends InitDriver {
    @Override
    @Test
    public void test() {
        LoginEPage ePage = new LoginEPage(super.getDriver());
        try {
            ePage.signIn("ntyen","1234");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
