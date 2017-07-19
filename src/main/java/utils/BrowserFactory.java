package utils;

import org.openqa.selenium.WebDriver;

abstract public class BrowserFactory {
    abstract public WebDriver open_browser(String browserName);

}
