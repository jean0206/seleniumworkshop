package co.edu.icesi.seleniumworkshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UniversityPage {
    public final static String POST_INPUT = "[data-testid=status-attachment-mentions-input]";
    public final static String MORE_OPTIONS_BUTTON = "[data-testid=ellipsis-sprout]";
    public final static String POST_COMMENT_BUTTON = "[data-testid=react-composer-post-button]";
    public final static String POST_VALIDATION_LINK = "a[href=/ingenieria.sistemas.icesi/posts/]";

    private final WebDriver webDriver;

    public UniversityPage(final WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void typePost(CharSequence... text) {
        webDriver.findElement(By.cssSelector(POST_INPUT)).sendKeys(text);
        webDriver.findElement(By.cssSelector(MORE_OPTIONS_BUTTON)).click();
        webDriver.findElement(By.cssSelector(POST_COMMENT_BUTTON)).click();
    }

    public WebElement getPostValidationLink() {
        return webDriver.findElement(By.cssSelector(POST_INPUT));
    }
}
