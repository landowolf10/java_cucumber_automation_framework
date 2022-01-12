package framework.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config
{
    WebDriver driver;

    public WebDriver setUp()
    {
        System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://www.facebook.com");
        driver.manage().window().maximize();

        return driver;
    }

    public WebDriver getDriver()
    {
        return  driver;
    }
}
