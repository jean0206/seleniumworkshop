package co.edu.icesi.seleniumworkshop.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = { "pretty", "html:target/cucumber" },
        glue = "co.edu.icesi.seleniumworkshop.steps",
        features = "classpath:features/Facebook.feature"
)
public class SeleniumRunnerTest {
}
