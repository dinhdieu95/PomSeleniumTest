package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginEPage {
    private WebDriver driver;
    private By usernameInput = By.name("UserName" ) ;
    private By passwordInput = By.name("Password" ) ;
    private By loginButton = By.id("btnLogin" );
    public LoginEPage(WebDriver driver){
        this.driver= driver;
    }
    public void enterUsername(String username){
        WebElement usernameBox = driver.findElement(usernameInput);
        if (usernameBox.isDisplayed())
            usernameBox.sendKeys(username);
    }
    public void enterPassword (String password){
        WebElement passwordBox = driver.findElement(passwordInput);
        if (passwordBox.isDisplayed())
            passwordBox.sendKeys(password);
    }
    public void clickLoginButton(){
        WebElement signin = driver.findElement(loginButton);
        if (signin.isDisplayed())
            signin.click();
    }
    public void signIn(String username, String password) throws Exception {
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
        Thread.sleep(1000);
    }
}
