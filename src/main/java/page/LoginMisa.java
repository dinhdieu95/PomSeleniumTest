package page;

import common.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginMisa {
    private WebDriver driver;
    private By username = By.id("txtUserName");
    private By pass = By.id("txtPassword");
    private By login = By.id("btnLogin");

    public LoginMisa(WebDriver driver) {
        this.driver = driver;
    }
    public void login(String username, String pass){
        Common.wait(driver, 5000);
        driver.findElement(this.username).sendKeys(username);
        driver.findElement(this.pass).sendKeys(pass);
        driver.findElement(this.login).click();
    }


}
