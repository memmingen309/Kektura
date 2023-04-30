package Testcases;

import Driver.DriverBase;
import Pages.HomePage;
import Pages.ToursPage;
import org.testng.annotations.Test;

public class ToursPageTest extends DriverBase {

    HomePage homePage;
    ToursPage toursPage;

    @Test
    public void tours() throws InterruptedException{
        homePage = new HomePage(driver, wait);
        toursPage = new ToursPage(driver, wait);

        homePage.loadHomePage();
        toursPage.blueTour();
        toursPage.rockenbauerTour();
        toursPage.alfoldTour();
    }
}
