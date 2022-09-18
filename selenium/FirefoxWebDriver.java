package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class FirefoxWebDriver {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","c:/software/Driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get ("http:/demo.nopcommerce.com/");



    }
}
