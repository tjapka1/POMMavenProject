package tests.bookStore;

import Pages.BookStore.LoginPage;
import Pages.BookStore.ProfilePage;
import Pages.HomePage;
import Pages.SidePanel;
import Pages.data.UserData;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.TestBase;

public class LoginPageTest extends TestBase {
    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getBookStore();
        new SidePanel(driver).getLoginPage();
    }

    @Test
    public void loginPositiveTest() {
        new LoginPage(driver)
                .login(UserData.USER_NAME,UserData.USER_PASSWORD)
                .assertAccount(UserData.USER_NAME);
    }

    @AfterMethod
    public void postCondition() {
        new ProfilePage(driver).logout();
    }
}
