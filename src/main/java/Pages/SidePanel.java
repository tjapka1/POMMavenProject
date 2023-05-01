package Pages;

import Pages.AlertFrameWindow.AlertsPage;
import Pages.AlertFrameWindow.BrowserWindowsPage;
import Pages.BookStore.LoginPage;
import Pages.BookStore.ProfilePage;
import Pages.Elements.BrokenLinksImagesPage;
import Pages.Interations.DroppablePage;
import Pages.widgets.SelectMenuPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SidePanel extends BasePage {
    public SidePanel(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[.='Login']")
    WebElement login;

    public LoginPage getLoginPage() {
        clickWithJSExecutor(login,0,400);
        return new LoginPage(driver);
    }

    @FindBy(css = ".show #item-3")
    WebElement profile;

    public ProfilePage selectProfile() {
        clickWithJSExecutor(profile, 0, 500);
        return new ProfilePage(driver);
    }

    @FindBy(xpath = "//span[.='Alerts']")
    WebElement alerts;

    public AlertsPage selectAlerts() {
        clickWithJSExecutor(alerts,0,300);
        return new AlertsPage(driver);
    }

    @FindBy(xpath = "//span[.='Browser Windows']")
    WebElement browserWindows;

    public BrowserWindowsPage selectBrowserWindows() {
        clickWithJSExecutor(browserWindows,0,50);
        return new BrowserWindowsPage(driver);
    }

    @FindBy(xpath = "//span[.='Select Menu']")
    WebElement selectMenu;



    public SelectMenuPage selectSelectMenu() {
        click(selectMenu);
        return new SelectMenuPage(driver);
    }

    @FindBy(xpath = "//span[.='Droppable']")
    WebElement droppable;

    public DroppablePage selectDroppable() {
        click(droppable);
        return new DroppablePage(driver);
    }

    @FindBy(xpath = "//span[.='Text Box']")
    WebElement textBox;

    public JavaScriptExecutor selectTextBox() {
        click(textBox);
        return new JavaScriptExecutor(driver);
    }

    @FindBy(xpath = "//span[.='Check Box']")
    WebElement checkBox;

    public JavaScriptExecutor selectCheckBox() {
        click(checkBox);
        return new JavaScriptExecutor(driver);
    }

    @FindBy(xpath = "//span[.='Practice Form']")
    WebElement practiceForm;

    public JavaScriptExecutor selectPracticeForm() {
        click(practiceForm);
        return new JavaScriptExecutor(driver);
    }

    @FindBy(xpath = "//span[.='Broken Links - Images']")
    WebElement brokenLinksImages;

    public BrokenLinksImagesPage selectBrokenLinksImages() {
        click(brokenLinksImages);
        return new BrokenLinksImagesPage(driver);
    }

}