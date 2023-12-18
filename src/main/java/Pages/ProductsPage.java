package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{
    @FindBy(id = "search_product")
    private WebElement searchBox;
    @FindBy(xpath = "//h2[@class='title text-center']")
    private WebElement allProductsHeader;
    public ProductsPage(WebDriver driver) {
        super(driver);
    }
    public boolean isAllProductsPageVisible(){
        return allProductsHeader.isDisplayed();
    }
    public void setSearchBox(String wear){
        searchBox.sendKeys(wear);
        searchBox.sendKeys(Keys.ENTER);
    }
}
