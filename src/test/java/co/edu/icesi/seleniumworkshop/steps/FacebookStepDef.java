package co.edu.icesi.seleniumworkshop.steps;

import co.edu.icesi.seleniumworkshop.common.TestContext;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class FacebookStepDef {

    private TestContext testsContext = new TestContext();
    private WebDriver webDriver;

    @Before
    public void setUp() {
        webDriver = testsContext.getDriver();
        webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        webDriver.quit();
        webDriver = null;
    }

    @Given("^I am in the Facebook's Home Page$")
    public void givenLoggedInHomePage() {
        webDriver.get(testsContext.getBaseUrl());
    }

    @Then("^the page title should say \"([^\"]*)\"$")
    public void thePageTitleShouldSay(String facebookTitle) throws Throwable {
        assertEquals(facebookTitle, webDriver.getTitle());
    }
}
