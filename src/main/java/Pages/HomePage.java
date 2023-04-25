package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Pages.BookStore.BookStorePage;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[text()='Book Store Application']")
    WebElement booStoreApp;

    public BookStorePage getBookStore() {
        clickWithJSExecutor(booStoreApp,0,800);
        return new BookStorePage(driver);
    }
    @FindBy(xpath = "//h5[.='Alerts, Frame & Windows']")
    WebElement alertsFrameWindows;
    public SidePanel getAlertsFrameWindows() {
        click(alertsFrameWindows);
        return new SidePanel(driver);
    }
    @FindBy(xpath = "//h5[.='Widgets']")
    WebElement widgets;
    public SidePanel getWitgets() {
        click(widgets);
        return new SidePanel(driver);
    }
}
