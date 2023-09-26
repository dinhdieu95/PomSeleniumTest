package testcase.end;

import com.codeborne.selenide.WebDriverRunner;
import common.InitDriver;
import common.data.DataProviderCsv;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import tikipage.SearchPage;

import static com.codeborne.selenide.Selenide.open;
import static common.config.WebConfig.TIKI_PAGE_URL;

public class SearchProductTest extends InitDriver {
    @Test(dataProvider = "searchDataCsv", dataProviderClass = DataProviderCsv.class, groups = "search")
    public void testcase2_login_to_tracker_csv(String text) {
        open(TIKI_PAGE_URL);
        WebDriver driver = WebDriverRunner.getWebDriver();
        driver.manage().window().fullscreen();
        SearchPage searchPage = new SearchPage(driver);

        searchPage.getSearchData(text);
    }

}
