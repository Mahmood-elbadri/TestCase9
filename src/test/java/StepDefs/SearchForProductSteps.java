package StepDefs;

import Pages.HomePage;
import Pages.ProductsPage;
import Pages.ResultsPage;
import Runner.SearchForProductRunner;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;


import java.io.File;
import java.lang.module.Configuration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SearchForProductSteps {
    WebDriver driver;
    HomePage home;
    ProductsPage product;
    ResultsPage result;

    public static ChromeOptions chromeOption() {
        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        options.setExperimentalOption("prefs", chromePrefs);
        options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        return options;
    }

    @Before
    public void setUp() {
        driver = new ChromeDriver(new ChromeOptions());
        home = new HomePage(driver);
        product = new ProductsPage(driver);
        result = new ResultsPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
    @Given("Navigate to url")
    public void navigate_to_url() {
        driver.get("https://automationexercise.com/");
    }

    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        Assert.assertTrue(home.isHomePageAppeared());
    }

    @And("Click on Products button")
    public void click_on_products_button() {
        home.clickProducts();
    }

    @When("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verify_user_is_navigated_to_all_products_page_successfully() {
        Assert.assertTrue(product.isAllProductsPageVisible());
    }

    @And("^Enter product name in (.*) and click search button$")
    public void enter_product_name_in_and_click_search_button(String wear) {
        product.setSearchBox(wear);
    }

    @Then("Verify SEARCHED PRODUCTS is visible")
    public void verify_SEARCHED_PRODUCTS_is_visible() {
        Assert.assertEquals(1, result.numberOfResults());
    }


}
