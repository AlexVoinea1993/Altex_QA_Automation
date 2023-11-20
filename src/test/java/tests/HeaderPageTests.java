package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HeaderPage;

public class HeaderPageTests extends BaseTest{

    @Test
    public void verifyHeaderTest(){
        HeaderPage headerPage = new HeaderPage(driver);
        Assert.assertTrue(headerPage.isLogoDisplayed(), "Error: the page title is not displayed");
        Assert.assertTrue(headerPage.isSearchBarDisplayed());
        Assert.assertTrue(headerPage.isCartIconDisplayed());
    }
}
