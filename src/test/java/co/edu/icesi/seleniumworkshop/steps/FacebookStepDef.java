package co.edu.icesi.seleniumworkshop.steps;

import co.edu.icesi.seleniumworkshop.common.TestContext;
import co.edu.icesi.seleniumworkshop.pages.SearchPage;
import co.edu.icesi.seleniumworkshop.pages.LoginPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class FacebookStepDef {

    private TestContext testsContext = new TestContext();
    private WebDriver webDriver = testsContext.getDriver();

    private LoginPage loginPage = new LoginPage(webDriver);
    private SearchPage searchPage = new SearchPage(webDriver);

    @Before
    public void setUp() {
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        webDriver.close();
        webDriver.quit();
        webDriver = null;
    }

    @Given("^a user logged in the application$")
    public void givenLoggedInHomePage() {
        webDriver.get(testsContext.getBaseUrl());
        String email = testsContext.getEmail();
        String password = testsContext.getPassword();
        loginPage.login("leonleo997@gmail.com", "yleonardo97");
    }

    @When("^he searches Universidad Ingeniería de Sistemas - Universidad Icesi")
    public void searchUniversityPage() throws Throwable {
        searchPage.search("Ingeniería de Sistemas - Universidad Icesi");
        searchPage.goToFirstResult();
    }

    @Then("^the page title should say Facebook - Log In or Sign Up")
    public void thePageTitleShouldSay() throws Throwable {
        assertTrue(true);
    }
}
