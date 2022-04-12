package tests;

import base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.ProductPage;

@Epic("Product page functionality")
public class ProductTests extends BaseTest {


    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Test description: ")
    @Story("Add product to cart")
    public void addProductToCart() {

        openURL("https://www.grover.com/es-es/products/msi-laptop-msi-creator-m16-a11uc-843es-spanish-qwerty-ips-16-qhd-60hz-intel-core-i7-11800h-32gb-1tb-ssd-nvidia-geforce-rtx-3050?selectedMinDuration=18");

        ProductPage productPage = new ProductPage(driver);
        String product = productPage.getProductName();
        Assert.assertEquals(product, "MSI Creator M16 A11UC-843ES - Gaming Portátil - Intel® Core™ i7-11800H - 32GB - 1TB SSD - NVIDIA® GeForce® RTX 3050");

        productPage.clickButtonAddToCard();
        String newProductTitle = productPage.getProductTitleInPopupCard().split(" - ")[0];

        Assert.assertEquals(productPage.getProductQuantityInCard(), "1");
        Assert.assertEquals(newProductTitle, "MSI Creator M16 A11UC-843ES");
    }
}
