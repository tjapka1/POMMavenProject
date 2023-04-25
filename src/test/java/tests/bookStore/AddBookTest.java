package tests.bookStore;

import Pages.BookStore.BookStorePage;
import Pages.BookStore.LoginPage;
import Pages.HomePage;
import Pages.SidePanel;
import Pages.data.UserData;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import tests.TestBase;

public class AddBookTest extends TestBase {
    @FindBy(id = "addNewRecordButton")
    WebElement addNewBookButton;
    public void precondition() {
        new HomePage(driver).getBookStore();
        new SidePanel(driver).getLoginPage();
        new LoginPage(driver)
                .login(UserData.USER_NAME,UserData.USER_PASSWORD)
                .assertAccount(UserData.USER_NAME);
        new HomePage(driver).getBookStore();
        driver.get("https://demoqa.com/books");
        new BookStorePage(driver).typeInSearchField("Git");
        //new BookStorePage(driver).addNewBookButton;


    }

    @Test
    public void afddokPositiveTest() {


    }
}
