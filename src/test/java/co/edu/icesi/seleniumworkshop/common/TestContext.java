package co.edu.icesi.seleniumworkshop.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestContext {

    private final Properties properties = new Properties();

    public TestContext()
    {
        loadProperties("test.properties");
    }

    private void loadProperties(final String propertiesFileName)
    {
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propertiesFileName))
        {
            properties.load(inputStream);
        }
        catch (IOException exception)
        {
            throw new IllegalStateException("Error loading " + propertiesFileName + " file", exception);
        }
    }

    public String getBaseUrl()
    {
        return properties.getProperty("baseUrl");
    }

    public String getDriverPath()
    {
        return properties.getProperty("pathToChromeDriver");
    }

    public WebDriver getDriver()
    {
        System.setProperty("webdriver.chrome.driver", getDriverPath());
        return new ChromeDriver();
    }
}
