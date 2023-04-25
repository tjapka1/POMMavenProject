package tests.widgets;

import Pages.HomePage;
import Pages.SidePanel;
import Pages.widgets.SelectMenuPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.TestBase;

public class SelectTests extends TestBase {
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getWitgets();
        new SidePanel(driver).selectSelectMenu();

    }
    @Test
    public void selectOldStyleTest() {
        new SelectMenuPage(driver).selectOldStyle("Green");
    }

    @Test
    public void multiSelectTest() {
        new SelectMenuPage(driver).multiSelect("Red");
    }

    @Test
    public void standardMultiSelectTest() {
        new SelectMenuPage(driver).standardMultiSelect(1);
    }

}
