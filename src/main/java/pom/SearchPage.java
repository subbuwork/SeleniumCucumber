package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchPage {

    WebDriver driver;
    public SearchPage(WebDriver webDriver){
        this.driver = webDriver;
    }

    @FindBy(how = How.ID, using = "twotabsearchtextbox")
    WebElement topNav;

    @FindBy(how = How.XPATH, using = "//div[@id='nav-search']/form/div[2]/div/input")
    WebElement searchButton;

    public void search_product(String searchterm){
        topNav.sendKeys(searchterm);
        searchButton.click();
    }
}
