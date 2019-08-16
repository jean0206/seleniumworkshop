package co.edu.icesi.seleniumworkshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final WebDriver webDriver;

    private final static String EMAIL_INPUT = "#email";
    private final static String PASSWORD_INPUT = "#pass";
    private final static String LOGIN_BUTTON = "[data-testid=royal_login_button]";

    public LoginPage(final WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void login(final String email, final String password) {
        webDriver.findElement(By.cssSelector(EMAIL_INPUT)).sendKeys(email);
        webDriver.findElement(By.cssSelector(PASSWORD_INPUT)).sendKeys(password);
        webDriver.findElement(By.cssSelector(LOGIN_BUTTON)).click();
    }
}
