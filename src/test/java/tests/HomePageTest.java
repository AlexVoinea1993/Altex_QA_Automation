package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.Constants;

public class HomePageTest extends BaseTest {

//    Tema: verificare banner rosu (culoarea de background, si culoarea textului din banner)
//    Fac un assert ca sunt 6 meniuri
//    Fac separat 6 asserturi, cate unul pentru fiecare meniu, in care verific ca e displayed, ca textul
//    e ce trebuie, si culoarea e alb
//    Un singur test pentru toate. Nume: verify banner test

    @Test
    public void logInTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickLogIcon();
        homePage.inputEmailAddress();
        homePage.inputPassword();
        homePage.clickSignInButton();
    }

    @Test
    public void verifyBannerTest() {
        HomePage homePage = new HomePage(driver);
        homePage.printDisplayedBannerColor();
        Assert.assertEquals(homePage.getDisplayedBannerColor(), Constants.RED_COLOR);
        Assert.assertTrue(homePage.isProductsButtonTextDisplayed());
        Assert.assertEquals(homePage.getProductsDisplayedText(), "Produse");
        homePage.printDisplayedProductsColor();
        Assert.assertEquals(homePage.getDisplayedProductsColor(), Constants.WHITE_COLOR);
        Assert.assertTrue(homePage.isBlackFridayButtonTextDisplayed());
        Assert.assertEquals(homePage.getBlackFridayButtonTextDisplayed(), "Black Friday");
        homePage.printBlackFridayColor();
        Assert.assertEquals(homePage.getBlackFridayColor(), Constants.WHITE_COLOR);
        Assert.assertTrue(homePage.isFinancingDisplayed());
        Assert.assertEquals(homePage.getFinancingDisplayed(), "Finantare");
        homePage.printFinancingDisplayedColor();
        Assert.assertEquals(homePage.getFinancingDisplayedColor(), Constants.WHITE_COLOR);
        Assert.assertTrue(homePage.isCustomerSupportDisplayed());
        Assert.assertEquals(homePage.getCustomerSupportDisplayed(), "Suport clienti");
        homePage.printCustomerSupportColor();
        Assert.assertEquals(homePage.getCustomerSupportColor(), Constants.WHITE_COLOR);
        Assert.assertTrue(homePage.isStoresDisplayed());
        Assert.assertEquals(homePage.getStoresDisplayed(), "Magazine");
        homePage.printStoresColor();
        Assert.assertEquals(homePage.getStoresColor(), Constants.WHITE_COLOR);
        Assert.assertTrue(homePage.isAltexTravelDisplayed());
        Assert.assertEquals(homePage.getAltexTravelDisplayed(), "Altex Travel");
        homePage.printAltexTravelColor();
        Assert.assertEquals(homePage.getAltexTravelColor(), Constants.WHITE_COLOR);
        Assert.assertEquals(homePage.getMenuNumber(), 6);
        Assert.assertEquals(homePage.getServiceNumber(), 4);
        Assert.assertEquals(homePage.getApplicationNumber(), 3);
        Assert.assertEquals(homePage.getProductsNumber(), 5);
        driver.close();
    }
}
