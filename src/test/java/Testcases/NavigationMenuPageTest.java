package Testcases;

import Driver.DriverBase;
import Pages.HomePage;
import Pages.NavigationMenuPage;
import org.testng.annotations.Test;

public class NavigationMenuPageTest extends DriverBase {
    HomePage homePage;
    NavigationMenuPage navigationMenuPage;

    @Test
    public void navigationTest(){
        homePage = new HomePage(driver, wait);
        navigationMenuPage = new NavigationMenuPage(driver, wait);

        homePage.loadHomePage();
        navigationMenuPage.contact();
        navigationMenuPage.info();
        navigationMenuPage.actualMenu();


    }
}
