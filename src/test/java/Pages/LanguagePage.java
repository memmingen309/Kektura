package Pages;

import Driver.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;

public class LanguagePage extends DriverBase {

    WebDriver driver;
    WebDriverWait wait;

    By germanby = By.id("red_stripe");
    By englishby = By.className("switch-language");
    By slovakby = By.xpath("//*[@id=\"mainMenu\"]/div/div/div/div[4]/ul[2]/li[3]/a");

    public LanguagePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void switchLanguageGerman() throws InterruptedException {
        WebElement german = driver.findElement(germanby);
        german.click();
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.termeszetjaro.hu/de/tour/wanderung/die-blaue-landestour-okt-/23265051/");
        driver.close();
        driver.switchTo().window(tabs2.get(0));
    }

    public void switchLanguageEnglish() throws InterruptedException {
        WebElement english = driver.findElement(englishby);
        english.click();
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.termeszetjaro.hu/en/tour/hiking-trail/national-blue-trail-okt-/23265051/");
        driver.close();
        driver.switchTo().window(tabs2.get(0));
    }

    public void switchLanguageSlovak() throws InterruptedException{
        WebElement slovak = driver.findElement(slovakby);
        slovak.click();
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.termeszetjaro.hu/sk/tour/pesi-vylet/modra-trasa-okt-/23265051/");
        driver.close();
        driver.switchTo().window(tabs2.get(0));
    }
}
