package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultsPage extends BasePage{
    @FindBy(xpath = "//div[@class='overlay-content']")
    private List<WebElement> listOfDresses;
    public ResultsPage(WebDriver driver) {
        super(driver);
    }
    public int numberOfResults(){
        return listOfDresses.size();
    }
}
