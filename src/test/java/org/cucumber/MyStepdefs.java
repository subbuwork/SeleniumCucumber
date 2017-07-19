package org.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pom.HomePage;
import pom.Product;
import pom.SearchPage;
import utils.Browser;

public class MyStepdefs {

    WebDriver webDriver;
    Browser browser;
    //String url = "https://www.amazon.com";

    @Before("@driver")
    public void setup(){
        browser = new Browser();
        webDriver = browser.open_browser("gc");


    }

    @Given("^Go to amazon Home page \"(.*)\"$")
    public void goToAmazonHomePage(String url) throws Throwable {
        HomePage homePage = PageFactory.initElements(webDriver,HomePage.class);
        homePage.home_page(url);

    }

    @Then("^Enter search term and click on search button$")
    public void enterSearchTermAndClickOnSearchButton() throws Throwable {
        SearchPage searchPage = PageFactory.initElements(webDriver,SearchPage.class);
        searchPage.search_product("Ferrari 458");

    }

    @Then("^User should see results page$")
    public void userShouldSeeResultsPage() throws Throwable {
        assert webDriver.getTitle().toLowerCase().contains("Ferrari 458");
       // Assert.assertEquals("",webDriver.getTitle());
    }

    @And("^Select product from product list$")
    public void selectProductFromProductList() throws Throwable {
        Product product = PageFactory.initElements(webDriver,Product.class);
        product.select_product();

    }

    @And("^Add product to the cart$")
    public void addProductToTheCart() throws Throwable {
        Product product = PageFactory.initElements(webDriver,Product.class);
        product.add_to_cart();
        assert webDriver.getTitle().contains("Shopping Cart");
    }

    @After("@driver")
    public void closeBrowser() throws Throwable {
        webDriver.close();
        webDriver.quit();
    }
}
