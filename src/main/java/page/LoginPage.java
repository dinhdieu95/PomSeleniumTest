package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By username = By.xpath("//input[@name= \"username\"]");// phần tử 1
    private By pass =  (By.xpath("//input[@name= \"password\"]")); // phần tử thứ 3
    private By buttonLogin =  (By.id("login")); // phần tử thứ 3

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickLogin(){
        driver.findElement(buttonLogin).click();
    }
    public void enterUsername(String username){
        driver.findElement(this.username).sendKeys(username);
    }
    public void enterPass(String pass){
        driver.findElement(this.pass).sendKeys(pass);
    }
}
