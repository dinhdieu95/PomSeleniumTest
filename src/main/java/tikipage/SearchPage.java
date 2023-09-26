package tikipage;

import common.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SearchPage {
    private WebDriver driver;
    private By search = By.xpath("//*[@data-view-id='main_search_form_input']");
    private By searchButton = By.xpath("//*[@data-view-id='main_search_form_button']");
    private By result = By.xpath("//*[@data-view-id='product_list_item']");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void getSearchData(String text) {
        driver.findElement(search).sendKeys(text);
        driver.findElement(searchButton).click();
        Common.fluentWaitBy(driver, 5000, result);

        Assert.assertTrue(driver.findElements(result).size() > 0, "Kết quả tìm kiếm bị sai");
    }

}
