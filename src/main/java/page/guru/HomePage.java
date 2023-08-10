package page.guru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private static WebDriver driver;
    private By noTextElement = By.className("radiobutton");// phần tử 1
    private By buttonYes =  (By.id("yes")); // phần tử thứ 3
    private By  buttonCheck = (By.id("buttoncheck"));
    private By TextElement = (By.className("radiobutton"));

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickButtonYes(){
        driver.findElement(buttonYes).click();
    }
    public void clickButtonCheckbox(){
        driver.findElement(buttonYes).click();
    }

    public WebElement getNoTextElement() {
        return driver.findElement(noTextElement);
    }


    public WebElement getButtonYes() {
        return driver.findElement(buttonYes);
    }



    public WebElement getButtonCheck() {
        return driver.findElement(buttonCheck);
    }


    public WebElement getTextElement() {
        return driver.findElement(TextElement);
    }

}