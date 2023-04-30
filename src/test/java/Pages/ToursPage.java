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
    By callby = By.xpath("/html/body/div[2]/header/div[2]/div/div/div/div/ul/li[2]/a/span");
    By storyby = By.xpath("/html/body/div[2]/header/div[2]/div/div/div/div/ul/li[3]/a/span");
    By listby = By.xpath("/html/body/div[2]/header/div[2]/div/div/div/div/ul/li[4]/a/span");
    By peopleby = By.xpath("/html/body/div[3]/div/section/div/div[1]/div[2]/a[1]");
    By bluePeopleby = By.xpath("/html/body/div[3]/div/section/div/div[1]/div[2]/a[1]");
    By numberby = By.xpath("/html/body/div[3]/div/section/div/div[1]/div[1]/h2/span");
    By rbpby = By.xpath("//*[@id=\"mainMenu\"]/div/div/div/div[4]/ul[1]/li[1]/ul/li[3]/a");
    By rbpdataby = By.xpath("//*[@id=\"block_11504\"]/div[1]/div/section[1]/div/div/div[2]/div/div[6]/p/a/span[1]");
    By logoby = By.id("Layer_1");
    By rbpcallby = By.xpath("/html/body/div[2]/header/div[2]/div/div/div/div/ul/li[2]/a/span");
    By rbpstoryby = By.xpath("/html/body/div[2]/header/div[2]/div/div/div/div/ul/li[3]/a/span");
    By rbppeopleby = By.xpath("/html/body/div[2]/header/div[2]/div/div/div/div/ul/li[4]/a/span");
    By rbpcompleteby = By.xpath("/html/body/div[3]/div/section/div/div[1]/div[1]/h2/span");
    By alfoldby = By.xpath("//*[@id=\"mainMenu\"]/div/div/div/div[4]/ul[1]/li[1]/ul/li[4]/a");
    By alfolddataby = By.xpath("//*[@id=\"block_11497\"]/div[1]/div/section[1]/div/div/div[2]/div/div[6]/p/a[1]/span[1]");
    By alfoldcallby = By.xpath("/html/body/div[2]/header/div[2]/div/div/div/div/ul/li[2]/a/span");
    By alfoldstoryby = By.xpath("/html/body/div[2]/header/div[2]/div/div/div/div/ul/li[3]/a/span");
    By alfoldpeopleby = By.xpath("/html/body/div[2]/header/div[2]/div/div/div/div/ul/li[4]/a/span");
    By nationalcircleby = By.xpath("//*[@id=\"mainMenu\"]/div/div/div/div[4]/ul[1]/li[1]/ul/li[5]/a");
    By nationalcirclepeopleby = By.xpath("/html/body/div[2]/header/div[2]/div/div/div/div/ul/li[2]/a/span");
    By circlenumberby = By.xpath("/html/body/div[3]/div/section/div/div[1]/div[1]/h2/span");

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

        WebElement callFor = driver.findElement(callby);
        callFor.click();

        WebElement story = driver.findElement(storyby);
        story.click();

        WebElement listOfPeople = driver.findElement(listby);
        listOfPeople.click();

        WebElement people = driver.findElement(peopleby);
        people.click();

        WebElement bluePeople = driver.findElement(bluePeopleby);
        bluePeople.click();

        WebElement blueNumber = driver.findElement(numberby);
        Assert.assertEquals(blueNumber.getText(), "8770");

        WebElement logo = driver.findElement(logoby);
        logo.click();
    }

    public void rockenbauerTour(){
        WebElement tours = driver.findElement(tourby);
        tours.click();
        WebElement rbp = driver.findElement(rbpby);
        rbp.click();

        WebElement rbpTourData = driver.findElement(rbpdataby);
        rbpTourData.click();

        ArrayList<String> newSectiontab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newSectiontab.get(1));
        Assert.assertEquals(driver.getCurrentUrl(), "https://turistaterkepek.hu/kekturahu/tablazatok/rpddk_szakasz_adatok.pdf");
        driver.close();
        driver.switchTo().window(newSectiontab.get(0));

        WebElement rbpCall = driver.findElement(rbpcallby);
        rbpCall.click();

        WebElement rbpStory = driver.findElement(rbpstoryby);
        rbpStory.click();

        WebElement rbpPeople = driver.findElement(rbppeopleby);
        rbpPeople.click();
        WebElement rbpComplete = driver.findElement(rbpcompleteby);
        Assert.assertEquals(rbpComplete.getText(), "2525");
        WebElement logo = driver.findElement(logoby);
        logo.click();
    }

    public void alfoldTour(){
        WebElement tours = driver.findElement(tourby);
        tours.click();

        WebElement alfold = driver.findElement(alfoldby);
        alfold.click();

        WebElement alfoldTourData = driver.findElement(alfolddataby);
        alfoldTourData.click();

        ArrayList<String> newSectiontab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newSectiontab.get(1));
        Assert.assertEquals(driver.getCurrentUrl(), "https://turistaterkepek.hu/kekturahu/tablazatok/ak_szakasz_adatok.pdf");
        driver.close();
        driver.switchTo().window(newSectiontab.get(0));

        WebElement alfoldCall = driver.findElement(alfoldcallby);
        alfoldCall.click();

        WebElement alfoldStory = driver.findElement(alfoldstoryby);
        alfoldStory.click();

        WebElement alfoldPeople = driver.findElement(alfoldpeopleby);
        alfoldPeople.click();
        WebElement alfoldComplete = driver.findElement(rbpcompleteby);
        Assert.assertEquals(alfoldComplete.getText(), "1330");
        WebElement logo = driver.findElement(logoby);
        logo.click();
    }

    public void nationalbluecircle(){
        WebElement tours = driver.findElement(tourby);
        tours.click();

        WebElement nationalBlueCircle = driver.findElement(nationalcircleby);
        nationalBlueCircle.click();

        WebElement nationalCirclePeople = driver.findElement(nationalcirclepeopleby);
        nationalCirclePeople.click();

        WebElement nationalCircleNumber = driver.findElement(circlenumberby);
        Assert.assertEquals(nationalCircleNumber.getText(), "401");
        WebElement logo = driver.findElement(logoby);
        logo.click();
    }
}
