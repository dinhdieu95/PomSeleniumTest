package common;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Common {
    //    public SOURCE_URL = System.getProperty("user.dir") + "/src/test/resources/";
    public static final String URL_SRC_CHROME = System.getProperty("user.dir") + "/src/test/resources/driver/chromedriver.exe";
    public static final String URL_SRC_FIREFOX = System.getProperty("user.dir") + "/src/test/resources/driver/geckodriver.exe";
    public static final String URL_SRC_ME = System.getProperty("user.dir") + "/src/test/resources/driver/msedgedriver.exe";
    public static final String CONFIG_DRIVER_CHROME = "webdriver.chrome.driver";
    public static final String CONFIG_DRIVER_FIREFOX = "webdriver.gecko.driver"; //firefox
    public static final String CONFIG_DRIVER_ME = "webdriver.edge.driver";

    public static WebDriverManager driver = WebDriverManager.chromedriver();
    public static WebDriver drv;

    public static void openFile(String fileName) {
        driver.setup();
        drv = new ChromeDriver();
        drv.get(System.getProperty("user.dir") + "/src/test/resources/" + fileName);
    }

    public static void close() {
        drv.close();
    }

    public static String getSource() {
        return System.getProperty("user.dir") + "/src/test/resources/";
    }
    public static void wait(WebDriver driver, long timeout ){
        driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
    }
    public static void fluentWait(WebDriver driver, long timeout , String data){
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(timeout))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(data)));
    }
    public static void fluentWaitByName(WebDriver driver, long timeout , String data){
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(timeout))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(data)));
    }
}
