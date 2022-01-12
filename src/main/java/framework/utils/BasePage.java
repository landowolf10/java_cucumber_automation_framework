package framework.utils;

import framework.config.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage extends Config
{
    public WebElement getElementBy(By elementLocator)
    {
        return getDriver().findElement(elementLocator);
    }

    public String getElementText(By elementLocator)
    {
        return getDriver().findElement(elementLocator).getText();
    }

    public String getElementAttribute(By elementLocator, String attribute)
    {
        return getDriver().findElement(elementLocator).getAttribute(attribute);
    }
}
