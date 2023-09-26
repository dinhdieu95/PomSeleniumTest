package testcase.example;

import common.RequestAPI;
import common.dto.DataDTO;
import io.restassured.response.Response;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.HomeMisaPage;
import page.LoginMisa;
import page.kho.xuatkho.ListBill;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static common.Common.CONFIG_DRIVER_CHROME;
import static common.Common.URL_SRC_CHROME;
import static common.config.ApiConfig.KEY;
import static common.config.ApiConfig.LIST_OUTWARDS;
import static common.config.WebConfig.MISA_LOGIN_PAGE_URL;

public class CheckAutoAPIWithGUITest {
    WebDriver driver;

    @BeforeTest
    public void setup() {


    }

    @Test
    public void check_between_GUI_and_api_test() {
        Map<String, Object> request = new HashMap<>();
        request.put("page", 1);
        request.put("start", 0);
        request.put("limit", 5);
        request.put("Authorization", KEY);
        request.put("CompanyCode", "misast");
        request.put("Accept", "application/json");

//        String body = "{ "us"}"

// lấy data API
        Response response = RequestAPI.get(LIST_OUTWARDS, request);
        ArrayList<Object> listDataApi = (ArrayList<Object>) response.jsonPath().getList("Data");

        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(MISA_LOGIN_PAGE_URL);
        LoginMisa loginMisa = new LoginMisa(driver);
        loginMisa.login("ntyen", "12345678@Abc");
//        HomeMisaPage homeMisaPage = new HomeMisaPage(driver);
//        homeMisaPage.vao_thu_muc_xuat_kho();
        driver.get("https://misast.mshopkeeper.vn/main#outward");
        ListBill listBill = new ListBill(driver);
        Actions action = new Actions(driver);
        List<WebElement> listSeri = listBill.getSeri();
//        for (WebElement element : listSeri) {
//            for (Object data : listDataApi) {
////                Assert.assertEquals(data.getRefNo(), element.getText(), " Check 2 phan tu giong nhau");
//                System.out.println( "phan tu tu ui: "+ element.getText());
//                action.moveToElement(element).perform();
//                Assert.assertTrue(data.toString().contains(element.getText().toString()), "Dữ liệu serinum bị lệch");
//                break;
//            }
//
//        }
        for (int i =0; i<5; i++){
            System.out.println( "phan tu tu ui: "+ listSeri.get(i).getText());
            action.moveToElement(listSeri.get(i)).perform();
            System.out.println("data tu api" + listDataApi.get(i));
            Assert.assertTrue(listDataApi.get(i).toString().contains(listSeri.get(i).getText().toString()), "Dữ liệu serinum bị lệch ở vị trí: " + (i+1));
        }
    }
    @AfterTest
    public void after(){
        driver.close();
    }
}
