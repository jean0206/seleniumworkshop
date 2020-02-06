package co.edu.icesi.seleniumworkshop.steps;

import co.edu.icesi.seleniumworkshop.common.TestContext;
import co.edu.icesi.seleniumworkshop.pages.LoginPage;
import co.edu.icesi.seleniumworkshop.pages.SearchPage;
import co.edu.icesi.seleniumworkshop.pages.UniversityPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertNotNull;

public class FacebookStepDef {

    private TestContext testsContext = new TestContext();
    private WebDriver webDriver = testsContext.getDriver();

    private LoginPage loginPage = new LoginPage(webDriver);
    private SearchPage searchPage = new SearchPage(webDriver);
    private UniversityPage universityPage = new UniversityPage(webDriver);

    @Before
    public void setUp() {
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Dimension d = new Dimension(1000,2000);
        webDriver.manage().window().setSize(d);
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
        loginPage.login(email, password);
    }

    @When("^he searches Universidad Ingeniería de Sistemas - Universidad Icesi")
    public void searchUniversityPage() {
        searchPage.search("ingeniería de sistemas - universidad icesi");
        searchPage.goToFirstResult();
    }

    @And("^he posts a comment$")
    public void hePostsAComment() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        universityPage.typePost("Software Developer In Test since ", formatter.format(date));
    }

    @Then("^the post should be loaded$")
    public void thePageTitleShouldSay() {
        assertNotNull(universityPage.getPostValidationLink());
    }
}
