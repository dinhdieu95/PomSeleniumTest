package page;

import common.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeMisaPage {
    private WebDriver driver;
    private By tabBarKho = By.id("stock");
    private By tabBarXuatKho = By.id("outward");

    public HomeMisaPage(WebDriver driver) {
        this.driver = driver;
    }
    public void vao_thu_muc_xuat_kho(){
        Common.wait(driver, 10000);
        driver.findElement(tabBarKho).click();
        Common.wait(driver, 5000);
        driver.findElement(tabBarXuatKho).click();

    }
}
