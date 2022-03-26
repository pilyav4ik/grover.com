package tests;

import base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.SearchResultsPage;

@Epic("Regression")
public class SearchTests extends BaseTest {

    @Test(priority = 1)
    @Severity(SeverityLevel.NORMAL)
    @Description("Check result count after search")
    public void checkResultCountAfterSearch(){

        openURL("https://grover.com");

        HomePage homePage = new HomePage(driver);
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);

        homePage.setTextToSearchProductTextbox("iPhone");
        homePage.submitSearchProductForm();
        Boolean res = searchResultsPage.resultProducts("77");

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
