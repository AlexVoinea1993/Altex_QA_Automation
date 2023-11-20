package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends BasePage {
    @FindBy(xpath = "//a[@class='Header-logo block bg-no-repeat ']")
    WebElement logo;
    @FindBy(xpath = "//div[@class='jsx-941926444 relative lg:ml-8 grow lg:flex-initial IgnoreClickOutside']")
    WebElement searchBar;
    @FindBy(css = ".jsx-9d04a24ff8b4af87.SessionCosTrigger")
    WebElement cart;

    public HeaderPage(WebDriver driver) {
        super(driver);
    }

    public boolean isLogoDisplayed() {
        return logo.isDisplayed();
    }

    public boolean isSearchBarDisplayed() {
        return searchBar.isDisplayed();
    }

    public boolean isCartIconDisplayed() {
        return cart.isDisplayed();
    }
}
