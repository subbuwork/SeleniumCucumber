package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser extends BrowserFactory {
    WebDriver webDriver;
    public WebDriver open_browser(String browserName){
       if (browserName.equalsIgnoreCase("gc")){
           System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Selenium\\chromedriver.exe");
           webDriver = new ChromeDriver();
       }else if (browserName.equalsIgnoreCase("ie")){
           System.setProperty("webdriver.ie.driver","E:\\Softwares\\Selenium\\IEDriverServer.exe");
           webDriver = new InternetExplorerDriver();
       }else if (browserName.equalsIgnoreCase("ff")){
           System.setProperty("webdriver.gecko.driver","E:\\Softwares\\Selenium\\geckodriver.exe");
           webDriver = new FirefoxDriver();

       }else if (browserName.equalsIgnoreCase("edge")){
           System.setProperty("webdriver.edge.driver","E:\\Softwares\\Selenium\\MicrosoftWebDriver.exe");
           webDriver = new EdgeDriver();
       }
        return webDriver;
    }
}
