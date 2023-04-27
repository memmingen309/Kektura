package Testcases;

import Driver.DriverBase;
import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomePageTest extends DriverBase {
    HomePage homePage;

    @Test
    public void loadHomePageTest() {
        homePage = new HomePage(driver, wait);
        homePage.loadHomePage();

    }
}
