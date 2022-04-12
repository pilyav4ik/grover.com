package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ProductPage extends BasePage {

    private final By productName = By.cssSelector(".rcscvt-4.geoDuH");
    private final By buttonAddToCard = By.xpath("//span[contains(text(),'Suscribirse')]");
    private final By productQuantityInCard = By.xpath("//div[@class='as1ppo-4 fCKDsy']");
    private final By productTitleInPopupCard = By.cssSelector(".sc-5fjnr2-6.JpujR");

    public ProductPage(WebDriver driver) {
        super(driver);
    }


    public String getProductName(){
        return driver.findElement(productName).getText();
    }

    public void clickButtonAddToCard(){
        driver.findElement(buttonAddToCard).click();
    }

    public String getProductQuantityInCard(){
        return driver.findElement(productQuantityInCard).getText();
    }

    public String getProductTitleInPopupCard(){
        return driver.findElement(productTitleInPopupCard).getText();
    }
}
