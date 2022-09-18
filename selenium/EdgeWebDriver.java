package selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeWebDriver {


    public static void main(String[] args) {

//        2. Set up the chromedriver - Path
        System.setProperty("webdriver.edge.driver", "C:/Software/Driver/msedgedriver.exe");

//        1. Create an instance of webdriver
        WebDriver driver = new EdgeDriver();


//        3. Navigate to Webpage
        driver.get("https://demo.nopcommerce.com");
    }
}



