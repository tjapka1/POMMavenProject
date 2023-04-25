package tests.AlertFrameWindow;

import Pages.AlertFrameWindow.AlertsPage;
import Pages.HomePage;
import Pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.TestBase;

public class AlertsTests extends TestBase {
    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getAlertsFrameWindows();
        new SidePanel(driver).selectAlerts();
    }
    @Test
    public void alertWithTimerTest(){
        new AlertsPage(driver).clickByAlertbuttonWithTimer();
    }
    @Test
    public void alertWithSelect(){
        String test ="Cancel";
        new AlertsPage(driver).clickByAlertbuttonWithSelect(test)
                .assertByResult(test);
    }
    @Test
    public void sendTextToAlertTest() {
        String text = "Hello World!";
        new AlertsPage(driver).sendTextToAlert(text)
                .accertByMessage(text);
    }
}
