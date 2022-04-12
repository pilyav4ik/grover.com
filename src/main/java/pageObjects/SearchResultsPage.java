package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultsPage extends BasePage {

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }


    public String resultProducts(){
        return driver.findElement(By.cssSelector("span.dnrk6q-0.iLROge.sc-18vpzdk-2.ejZQgL")).getText().toLowerCase();
    }

    public List<WebElement> resultProductsList(){
        return driver.findElements(By.className("devi6e-0"));
    }

    public WebElement minPriceSliderControl(){
        return driver.findElement(By.className("input-range__slider-container"));
    }
}
