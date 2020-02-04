package co.edu.icesi.seleniumworkshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    private final WebDriver webDriver;

    private final static String SEARCH_INPUT = "[data-testid=search_input]";
    private final static String FIRST_RESULT_IMAGE = "#BrowseResultsContainer a>img[alt^=Ing]";

    public SearchPage(final WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void search(final String content) {
        webDriver.findElement(By.cssSelector(SEARCH_INPUT)).sendKeys(content, Keys.RETURN);
    }

    public void goToFirstResult() {
        webDriver.findElement(By.cssSelector(FIRST_RESULT_IMAGE)).click();
    }
}
