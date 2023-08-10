package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchByText {
    private WebDriver webDriver;

    WebElement withText;

    public SearchByText(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebElement getWithText() {
        return withText;
    }

    public void setWithText(String withText) {
        this.withText = webDriver.findElement(By.xpath("//*[contains(text(), \"" + withText + "\")]"));
    }
}
