package page;

import common.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
//    private By username = By.id("user_email_login");
    private By username = By.xpath("//*[@formcontrolname='username']");
//    private By pass =  (By.id("user_password")); // phần tử thứ 3
    private By pass =  (By.xpath("//*[@formcontrolname='password']")); // phần tử thứ 3
//    private By buttonLogin =  (By.id("user_submit")); // phần tử thứ 3
    private By buttonLogin =  (By.xpath("//button[@type='submit']")); // phần tử thứ 3

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickLogin(){
        driver.findElement(buttonLogin).click();
    }
    public void enterUsername(String username){
        Common.wait(driver, 5000);
        driver.findElement(this.username).sendKeys(username);
    }
    public void enterPass(String pass){
        driver.findElement(this.pass).sendKeys(pass);
    }
}
