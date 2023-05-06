package Testcases;

import Driver.DriverBase;
import Pages.BlogPage;
import Pages.HomePage;
import org.testng.annotations.Test;

public class BlogPageTest extends DriverBase {
    HomePage homePage;
    BlogPage blogPage;

    @Test
    public void blogTest(){
        homePage = new HomePage(driver, wait);
        blogPage = new BlogPage(driver, wait);

        homePage.loadHomePage();
        blogPage.blogs();
    }
}
