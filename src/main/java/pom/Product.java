package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Product {
    WebDriver webDriver;
    static String eleLocator = "";

    public Product(WebDriver driver){
        this.webDriver =driver;
    }

    @FindBy(how = How.XPATH,using = "//ul[@id='s-results-list-atf']/li[1]/div/div[2]/div/div/a")
    WebElement item;

    @FindBy(how = How.ID,using = "add-to-cart-button")
    WebElement cart;


    public void select_product(){
        item.click();
    }

    public void add_to_cart(){
        cart.click();
    }
}
