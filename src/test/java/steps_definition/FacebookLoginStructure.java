package steps_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class FacebookLoginStructure
{
    project.pages.FacebookLoginStructure login = new project.pages.FacebookLoginStructure();

    @Given("Main page is open")
    public void openMainPage()
    {
        login.setUp();
    }

    @Then("Validate page title is {string}")
    public void getPageTitle(String expectedTitle)
    {
        login.expectedTitleVisible(expectedTitle);
    }
}
