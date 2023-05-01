package Pages;


import Pages.Interations.DroppablePage;
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
        click(booStoreApp);
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

    @FindBy(xpath = "//h5[.='Interactions']")
    WebElement interactions;

    public SidePanel getInteractions() {
        click(interactions);
        return new SidePanel(driver);
    }

    @FindBy(xpath = "//h5[.='Elements']")
    WebElement elements;

    public SidePanel getElements() {
        click(elements);
        return new SidePanel(driver);
    }

    @FindBy(xpath = "//h5[.='Forms']")
    WebElement forms;

    public SidePanel getForms() {
        click(forms);
        return new SidePanel(driver);
    }
}
