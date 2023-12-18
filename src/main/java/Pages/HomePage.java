package Pages;

import org.checkerframework.checker.initialization.qual.FBCBottom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy(xpath= "//a[@href='/products']")
    private WebElement productsBtn;
    @FindBy(xpath = "//img[@src='/static/images/home/logo.png']")
    private WebElement homePageLogo;
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void clickProducts(){
        productsBtn.click();
    }
    public boolean isHomePageAppeared(){
        return (homePageLogo.isDisplayed());
    }
}
