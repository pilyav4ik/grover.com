package tests;

import base.BaseTest;
import functionality.Retry;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.SearchResultsPage;

@Epic("Regression")
public class SearchTests extends BaseTest {

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test description: Check result count after search")
    @Story("Check result count after search")
    public void checkResultCountAfterSearch(){

        openURL("https://grover.com");

        HomePage homePage = new HomePage(driver);
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);

        homePage.setTextToSearchProductTextbox("iPhone");
        homePage.submitSearchProductForm();
        Boolean res = searchResultsPage.resultProducts("80");

        Assert.assertEquals(res, true);
    }

    @Test(priority = 1)
    @Severity(SeverityLevel.NORMAL)
    @Description("Check products count after search on the page")
    public void checkProductsCountAfterSearch(){

        openURL("https://grover.com");

        HomePage homePage = new HomePage(driver);
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);

        homePage.setTextToSearchProductTextbox("iPhone");
        homePage.submitSearchProductForm();


        int productListSize = searchResultsPage.resultProductsList().size();

        Assert.assertEquals(productListSize, 24);
    }
}
