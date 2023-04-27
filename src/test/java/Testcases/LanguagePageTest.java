package Testcases;

import Driver.DriverBase;
import Pages.HomePage;
import Pages.LanguagePage;
import org.testng.annotations.Test;

public class LanguagePageTest extends DriverBase {
    HomePage homePage;
    LanguagePage languagePage;

    @Test
    public void switchLanguage() throws InterruptedException {
        homePage = new HomePage(driver, wait);
        languagePage = new LanguagePage(driver, wait);

        homePage.loadHomePage();
        languagePage.switchLanguageGerman();
        languagePage.switchLanguageEnglish();
        languagePage.switchLanguageSlovak();
    }
}
