package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchBy {
    private WebDriver webDriver;
    private WebElement element;

    public SearchBy(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebElement getCss() {
        return element;
    }

    public void setWithCss(String css) {
        this.element = webDriver.findElement(By.cssSelector(css));
    }


    public WebElement getClassName() {
        return element;
    }

    public void setWithClassName(String className) {
        this.element = webDriver.findElement(By.className(className));
    }

    public WebElement getName() {
        return element;
    }

    public void setWithName(String className) {
        this.element = webDriver.findElement(By.name(className));
    }


    public WebElement getByID() {
        return element;
    }

    public void setWithID(String id) {
        this.element = webDriver.findElement(By.id(id));
    }
    public WebElement getByXpath() {
        return element;
    }

    public void setWithXpath(String xpath) {
        this.element = webDriver.findElement(By.xpath(xpath));
    }

    public WebElement getBySelector() {
        return element;
    }

    public void setWithSelector(String selector) {
        this.element = webDriver.findElement(By.cssSelector(selector));
    }

    public void setWithSelector(String selector, int index) {
        List<WebElement> list = webDriver.findElements(By.cssSelector(selector));
        for (int i = 0; i < list.size(); i++) {
            if (i == index) {
                this.element = webDriver.findElement(By.cssSelector(selector));
                break;
            }
        }

    }
}
