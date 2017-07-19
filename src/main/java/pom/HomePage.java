package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver webDriver){
        this.driver = webDriver;
    }

    public void home_page(String url){
        driver.get(url);
    }
}
