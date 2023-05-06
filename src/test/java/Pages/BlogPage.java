package Pages;

import Driver.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BlogPage extends DriverBase {
    WebDriver driver;
    WebDriverWait wait;

    By whatisby = By.xpath("/html/body/div[5]/div/div[1]/article/a/div");
    By logoby = By.id("Layer_1");
    By startby = By.xpath("/html/body/div[5]/div/div[2]/article/a/div");
    By mapby = By.xpath("/html/body/div[5]/div/div[3]/article/a/div");
    By backbtnby = By.xpath("//*[@id=\"block_11409\"]/div[1]/div/section/div/div[2]/div[1]/article/div[4]/a");

    public BlogPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void blogs(){
        WebElement whatIsBlueTour = driver.findElement(whatisby);
        whatIsBlueTour.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.kektura.hu/tudastar-cikk/mi-az-a-kektura-2021-01-27");
        WebElement logo = driver.findElement(logoby);
        logo.click();

        WebElement howToStart = driver.findElement(startby);
        howToStart.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.kektura.hu/tudastar-cikk/a-kekturazas-elso-lepesei");
        logo = driver.findElement(logoby);
        logo.click();

        WebElement map = driver.findElement(mapby);
        map.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.kektura.hu/tudastar-cikk/igy-hasznald-az-mtsz-terkepportaljat");
        WebElement backBtn = driver.findElement(backbtnby);
        new Actions(driver)
                .scrollToElement(backBtn)
                .perform();
        backBtn.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.kektura.hu/tudastar");
        logo = driver.findElement(logoby);
        logo.click();
    }
}
