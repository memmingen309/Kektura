package Pages;

import Driver.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;

public class ToursPage extends DriverBase {

    WebDriver driver;
    WebDriverWait wait;

    By tourby = By.xpath("//*[@id=\"mainMenu\"]/div/div/div/div[4]/ul[1]/li[1]/a");
    By blueby = By.xpath("//*[@id=\"mainMenu\"]/div/div/div/div[4]/ul[1]/li[1]/ul/li[1]/a");
    By stamppdfby = By.xpath("//*[@id=\"block_11505\"]/div[1]/div/section[1]/div/div/div[2]/div/div[4]");
    By stagesby = By.xpath("//*[@id=\"block_11505\"]/div[1]/div/section[1]/div/div/div[2]/div/div[6]/p/a");
    By discoveryby = By.linkText("világ 25 leginkább ajánlott utazási célpontja");
    By sectionby = By.linkText("szakasz");

    public ToursPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void blueTour() throws InterruptedException {
        WebElement tours = driver.findElement(tourby);
        tours.click();
        WebElement blueTour = driver.findElement(blueby);
        blueTour.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.kektura.hu/okt-szakaszok");

        WebElement stampPDF = driver.findElement(stamppdfby);
        stampPDF.click();
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        Assert.assertEquals(driver.getCurrentUrl(),"https://turistaterkepek.hu/kekturahu/gpx/tablazatok/OKT_aktualis_belyegzohelyek_20230330.pdf");
        driver.close();
        driver.switchTo().window(tabs2.get(0));


        WebElement stagesPDF = driver.findElement(stagesby);
        stagesPDF.click();
        ArrayList<String> newtab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newtab.get(1));
        Assert.assertEquals(driver.getCurrentUrl(),"https://turistaterkepek.hu/kekturahu/tablazatok/okt_szakasz_adatok.pdf");
        driver.close();
        driver.switchTo().window(newtab.get(0));

        WebElement discovery = driver.findElement(discoveryby);
        discovery.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.turistamagazin.hu/hir/a-vilag-legjobb-utazasi-celpontjai-koze-valasztottak-az-orszagos-kekturat");
        driver.get("https://www.kektura.hu/okt-szakaszok");

        WebElement section = driver.findElement(sectionby);
        section.click();
        ArrayList<String> newSectiontab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newSectiontab.get(1));
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.kektura.hu/tudastar-cikk/mit-jelent-azhogy-szakasz");
        driver.close();
        driver.switchTo().window(newSectiontab.get(0));
    }
}
