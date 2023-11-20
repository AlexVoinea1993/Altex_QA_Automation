package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Constants;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage {
    @FindBy(xpath = "//span[@class='jsx-9d04a24ff8b4af87 hidden sm:block']")
    WebElement logIn;
    @FindBy(xpath = "(//input[@name='email'])[1]")
    WebElement email;
    @FindBy(xpath = "//input[@name='password']")
    WebElement password;
    @FindBy(xpath = "//span[contains(text(),'Autentificare')]")
    WebElement signIn;
    @FindBy(css = ".MainMenuGeneralWrapper.bg-red-brand")
    WebElement banner;
    @FindBy(xpath = "//span[contains(text(),'Produse')]")
    WebElement products;
    @FindBy(xpath = "(//a[contains(text(),'Black Friday')])[2]")
    WebElement blackFriday;
    @FindBy(xpath = "//a[contains(text(),'Finantare')]")
    WebElement financing;
    @FindBy(xpath = "(//a[contains(text(),'Suport clienti')])[2]")
    WebElement customerSupport;
    @FindBy(xpath = "(//a[contains(text(),'Magazine')])[2]")
    WebElement stores;
    @FindBy(xpath = "(//a[contains(text(),'Altex Travel')])[2]")
    WebElement altexTravel;
    @FindBy(css = ".MainMenu-item")
    List<WebElement> bannerMenuList;
    @FindBy(css = ".sm\\:w-auto.mb-3")
    List<WebElement> serviceList;
    @FindBy(css = ".max-h-\\[40px\\]")
    List<WebElement> applicationsList;
    @FindBy(css = ".flex.items-center.px-4")
    List<WebElement> productsList;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickLogIcon() {
        logIn.click();
    }

    public void inputEmailAddress() {
        email.sendKeys(Constants.EMAIL_ADDRESS);
    }

    public void inputPassword() {
        password.sendKeys(Constants.PASSWORD);
    }

    public void clickSignInButton() {
        signIn.click();
    }

    public void printDisplayedBannerColor() {
        System.out.println(banner.getCssValue("background-color"));
    }

    public String getDisplayedBannerColor() {
        return banner.getCssValue("background-color");
    }

    public boolean isProductsButtonTextDisplayed() {
        return products.isDisplayed();
    }

    public String getProductsDisplayedText() {
        return products.getText();
    }

    public void printDisplayedProductsColor() {
        System.out.println(products.getCssValue("color"));
    }

    public String getDisplayedProductsColor() {
        return products.getCssValue("color");
    }

    public boolean isBlackFridayButtonTextDisplayed() {
        return blackFriday.isDisplayed();
    }

    public String getBlackFridayButtonTextDisplayed() {
        return blackFriday.getText();
    }

    public void printBlackFridayColor() {
        System.out.println(blackFriday.getCssValue("color"));
    }

    public String getBlackFridayColor() {
        return blackFriday.getCssValue("color");
    }

    public boolean isFinancingDisplayed() {
        return financing.isDisplayed();
    }

    public String getFinancingDisplayed() {
        return financing.getText();
    }

    public void printFinancingDisplayedColor() {
        System.out.println(financing.getCssValue("color"));
    }

    public String getFinancingDisplayedColor() {
        return financing.getCssValue("color");
    }

    public boolean isCustomerSupportDisplayed() {
        return customerSupport.isDisplayed();
    }

    public String getCustomerSupportDisplayed() {
        return customerSupport.getText();
    }

    public void printCustomerSupportColor() {
        System.out.println(customerSupport.getCssValue("color"));
    }

    public String getCustomerSupportColor() {
        return customerSupport.getCssValue("color");
    }

    public boolean isStoresDisplayed() {
        return stores.isDisplayed();
    }

    public String getStoresDisplayed() {
        return stores.getText();
    }

    public void printStoresColor() {
        System.out.println(stores.getCssValue("color"));
    }

    public String getStoresColor() {
        return stores.getCssValue("color");
    }

    public boolean isAltexTravelDisplayed() {
        return altexTravel.isDisplayed();
    }

    public String getAltexTravelDisplayed() {
        return altexTravel.getText();
    }

    public void printAltexTravelColor() {
        System.out.println(altexTravel.getCssValue("color"));
    }

    public String getAltexTravelColor() {
        return altexTravel.getCssValue("color");
    }

    public int getMenuNumber() {
        return bannerMenuList.size();
    }

    public int getServiceNumber() {
        return serviceList.size();
    }

    public int getApplicationNumber() {
        return applicationsList.size();
    }

    public int getProductsNumber() {
        return productsList.size();
    }
}

