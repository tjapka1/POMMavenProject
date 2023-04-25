package Pages.AlertFrameWindow;

import Pages.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class AlertsPage extends BasePage {
    public AlertsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "timerAlertButton")
    WebElement timerAlertButton;
    public AlertsPage clickByAlertbuttonWithTimer() {
        click(timerAlertButton);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Alert myAlert= wait.until(ExpectedConditions.alertIsPresent());
        myAlert.accept();

        return this;
    }

    @FindBy(id = "confirmButton")
    WebElement confirmButton;
    public AlertsPage clickByAlertbuttonWithSelect(String text) {
        click(confirmButton);
        if (text!=null && text.equalsIgnoreCase("ok")) {
            driver.switchTo().alert().accept();
        } else if (text!=null && text.equalsIgnoreCase("cancel")) {
            driver.switchTo().alert().dismiss();
        }
        return this;
    }
    @FindBy(id = "confirmResult")
    WebElement confirResult;

    public AlertsPage assertByResult(String text) {
        Assert.assertTrue(confirResult.getText().contains(text));
        return this;
    }

    @FindBy (id = "promtButton")
    WebElement promtButton;
    public AlertsPage sendTextToAlert(String text) {
        click(promtButton);
        if (text!=null){
            driver.switchTo().alert().sendKeys(text);

        }
        driver.switchTo().alert().accept();
        return this;
    }
    @FindBy (id = "promptResult")
    WebElement promtResult;
    public AlertsPage accertByMessage(String message) {
        Assert.assertTrue(promtResult.getText().contains(message));

        return this;
    }
}
