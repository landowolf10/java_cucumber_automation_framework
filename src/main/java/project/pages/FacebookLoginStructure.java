package project.pages;

import framework.utils.BasePage;
import org.openqa.selenium.By;

public class FacebookLoginStructure extends BasePage
{
    public void expectedTitleVisible(String expectedTitle)
    {
        String currentTitle = getElementAttribute(By.xpath("//div[1]/div/img"), "alt");

        System.out.println("Current title: " + currentTitle);

        assert currentTitle.equals(expectedTitle);

        getDriver().quit();
    }
}
