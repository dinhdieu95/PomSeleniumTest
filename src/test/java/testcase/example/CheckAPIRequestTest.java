package testcase.example;

import com.codeborne.selenide.WebDriverRunner;
import common.Common;
import org.apache.http.HttpRequest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.devtools.*;
//import org.openqa.selenium.devtools.HasDevTools;
import org.openqa.selenium.logging.LogEntry;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.LoginPage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.open;
import static common.Common.CONFIG_DRIVER_CHROME;
import static common.Common.URL_SRC_CHROME;
import static common.config.WebConfig.TCBS_LOGIN_PAGE_URL;

public class CheckAPIRequestTest {
    HttpRequest httpRequest;
    WebDriver driver;

    @BeforeTest
    public void setup() {
//        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get(TCBS_LOGIN_PAGE_URL);
        open(TCBS_LOGIN_PAGE_URL);

    }

    static String output = "";

    @Test
    public void test() {

        Map<String, Object> request = new HashMap<>();
        driver.manage().getCookies().toArray();
        Common.wait(driver, 5000);
//        driver.manage().logs().get(String.valueOf(LogType.PERFORMANCE));
//        LoginDTO loginDTO = new LoginDTO("105C056630","12345678"); // body
//        Response response = RequestAPI.post(API_LOGIN, request, loginDTO);

//        DevTools devTools = getLocalDevTools();

//        DevTools devTools = ((ChromeDriver) driver).getDevTools();
//        devTools.createSession();

        ChromeDriver driver = (ChromeDriver) WebDriverRunner.getWebDriver();
//        DevTools devTools = ( driver).getDevTools();
//        devTools.createSession();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("105C056630");
        loginPage.enterPass("12345678");
        loginPage.clickLogin();

//        devTools.addListener(Network.requestWillBeSent(),
//                entry -> {
//                    output = entry.getRequest().getPostData().get();
//                    System.out.println(entry.getRequest().getPostData().get());
//                    System.out.println("Request URI : " + entry.getRequest().getUrl() + "\n"
//                            + " With method : " + entry.getRequest().getMethod() + "\n");
//                    entry.getRequest().getMethod();
//                });
        for (LogEntry entry : driver.manage().logs().get("browser")) {
            System.out.println(entry.toString());
        }

//        DevTools devTools =driver;
//        devTools.createSession();

//        HttpClient client = driver.manage().

    }

    @AfterTest
    public void close() {
        driver.close();

    }
}
