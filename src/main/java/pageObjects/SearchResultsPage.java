package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage extends BasePage {

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }


    public boolean resultProducts(String resultsCount){
        return driver.findElement(By.xpath("//span[contains(text(), '"+resultsCount +" resultados')]")).isDisplayed();
    }
}
