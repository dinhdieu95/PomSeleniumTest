package tikipage;


import common.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginTikiPage {
    private WebDriver driver;
    private By buttonLogin = By.xpath("//span[text() ='Tài khoản']");

    private By enterUser = By.xpath("//input[@placeholder = 'Số điện thoại']");
    private By clickContinute = By.xpath("//*[text() ='Tiếp Tục']");
    private By verifyNumber = By.xpath("//*[text() ='Nhập mã xác minh']");
    private By loginWithMail = By.xpath("//*[@class='login-with-email']");
    private By mail = By.xpath("//*[@name='email']");
    private By pass = By.xpath("//*[@type='password']");
    private By login = By.xpath("//*[text() ='Đăng nhập']");

    public LoginTikiPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loginWithMails(String email, String pass) {
        driver.findElement(buttonLogin).click();
        Common.fluentWaitBy(driver, 5000, loginWithMail);
        driver.findElement(loginWithMail).click();
        Common.fluentWaitBy(driver, 5000, mail);
        driver.findElement(mail).sendKeys(email);
        driver.findElement(this.pass).sendKeys(pass);
        driver.findElement(login).click();
    }

    public void loginOrRegWithPhone(String phone) {
        driver.findElement(buttonLogin).click();
        Common.fluentWaitBy(driver, 5000, loginWithMail);
        driver.findElement(enterUser).sendKeys(phone);
        driver.findElement(clickContinute).click();
        Common.fluentWaitBy(driver, 5000, verifyNumber);
        Assert.assertTrue(driver.findElement(verifyNumber).isDisplayed());
    }
}
