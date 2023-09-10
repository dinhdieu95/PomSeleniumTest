package page.kho.xuatkho;

import common.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ListBill {
    By date_column = By.xpath("//td[@data-columnid ='MISADateColumn-1388']");
    By seri = By.xpath("//tr/td[3]");
    By object = By.xpath("//td[@data-columnid ='MISAGridColumn-1408']");
    By sum = By.xpath("//td[@data-columnid ='MISANumberColumn-1418']");

    private WebDriver driver;

    public ListBill(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getDate_column() {
        return driver.findElements(date_column);
    }

    public List<WebElement> getSeri() {
        Common.wait(driver, 15000);
        return driver.findElements(seri);
    }

    public List<WebElement> getObject() {
        return driver.findElements(object);
    }

    public List<WebElement> getSum() {
        return driver.findElements(sum);
    }
}
