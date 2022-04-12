package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;

    private final By acceptCookiesButton = By.xpath("//*[text()='Aceptar todas']");

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acceptCookies(){
        driver.findElement(acceptCookiesButton).click();
    }
}
