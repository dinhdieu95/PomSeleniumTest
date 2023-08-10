package page.shopee;

import org.openqa.selenium.WebElement;

public class HomePage {
//    @FindBys(value = "")
    private WebElement searchInput;

    public HomePage(WebElement searchInput) {
        this.searchInput = searchInput;
    }
}
