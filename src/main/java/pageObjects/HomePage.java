package pageObjects;

import base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private final By searchProductTextbox = By.xpath("//input[@type='text']");

    public HomePage(WebDriver driver) {
        super(driver);
    }


    @Step("Set text to text box for search products")
    public void setTextToSearchProductTextbox(String text){
        driver.findElement(searchProductTextbox).sendKeys(text);
    }

    @Step("Submit form for search products")
    public void submitSearchProductForm(){
        driver.findElement(searchProductTextbox).sendKeys(Keys.ENTER);
    }
}
