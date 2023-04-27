package Pages;

import Driver.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class NavigationMenuPage extends DriverBase {

    WebDriver driver;
    WebDriverWait wait;

    By contactMenuby = By.xpath("//*[@id=\"mainMenu\"]/div/div/div/div[4]/ul[1]/li[4]/a");
    By verifyby = By.xpath("//*[@id=\"mainMenu\"]/div/div/div/div[4]/ul[1]/li[4]/ul/li[1]/a");
    By rewardby = By.xpath("//*[@id=\"mainMenu\"]/div/div/div/div[4]/ul[1]/li[4]/ul/li[2]/a");
    By messageby = By.xpath("//*[@id=\"mainMenu\"]/div/div/div/div[4]/ul[1]/li[4]/ul/li[3]/a");
    By companyby = By.xpath("//*[@id=\"mainMenu\"]/div/div/div/div[4]/ul[1]/li[4]/ul/li[4]/a");
    By trademarkby = By.xpath("//*[@id=\"mainMenu\"]/div/div/div/div[4]/ul[1]/li[4]/ul/li[5]/a");
    By infoby = By.xpath("//*[@id=\"mainMenu\"]/div/div/div/div[4]/ul[1]/li[3]/a");
    By faqby = By.xpath("/html/body/div[2]/header/div[2]/div/div/div/div/ul/li[2]/a/span");
    By actualby = By.xpath("//*[@id=\"mainMenu\"]/div/div/div/div[4]/ul[1]/li[2]/a");
    By warningby = By.xpath("//*[@id=\"mainMenu\"]/div/div/div/div[4]/ul[1]/li[2]/ul/li[1]/a");
    By newsby = By.xpath("//*[@id=\"mainMenu\"]/div/div/div/div[4]/ul[1]/li[2]/ul/li[2]/a");
    By interviewby = By.xpath("/html/body/div[3]/div/section/div/div[1]/div/ul/li[2]/a");
    By everybodyby = By.xpath("/html/body/div[3]/div/section/div/div[1]/div/ul/li[3]/a");
    By inspectorby = By.xpath("/html/body/div[3]/div/section/div/div[1]/div/ul/li[4]/a");
    By personalby = By.xpath("/html/body/div[3]/div/section/div/div[1]/div/ul/li[5]/a");
    By logoby = By.id("Layer_1");

    public NavigationMenuPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void contact(){
        WebElement contactMenu = driver.findElement(contactMenuby);
        contactMenu.click();
        WebElement verifyMenu = driver.findElement(verifyby);
        verifyMenu.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.kektura.hu/igazolofuzet-leadasa");

        contactMenu = driver.findElement(contactMenuby);
        contactMenu.click();
        WebElement getReward = driver.findElement(rewardby);
        getReward.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.kektura.hu/elismeres-atvetele");

        contactMenu = driver.findElement(contactMenuby);
        contactMenu.click();
        WebElement sendMessage = driver.findElement(messageby);
        sendMessage.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.kektura.hu/uzenet-kuldese");

        contactMenu = driver.findElement(contactMenuby);
        contactMenu.click();
        WebElement companyDetails = driver.findElement(companyby);
        companyDetails.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.kektura.hu/ceginformaciok");

        contactMenu = driver.findElement(contactMenuby);
        contactMenu.click();
        WebElement trademark = driver.findElement(trademarkby);
        trademark.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.kektura.hu/vedjegy");
    }

    public void info(){
        WebElement info = driver.findElement(infoby);
        info.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.kektura.hu/tudastar");

        WebElement faq = driver.findElement(faqby);
        faq.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.kektura.hu/gyakran-ismetelt-kerdesek");
    }

    public void actualMenu(){
        WebElement actual = driver.findElement(actualby);
        actual.click();
        WebElement warning = driver.findElement(warningby);
        warning.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.kektura.hu/figyelmeztetesek");

        actual = driver.findElement(actualby);
        actual.click();
        WebElement news = driver.findElement(newsby);
        news.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.kektura.hu/hirek");
        WebElement interview = driver.findElement(interviewby);
        interview.click();

        WebElement forEveryBody = driver.findElement(everybodyby);
        forEveryBody.click();

        WebElement inspector = driver.findElement(inspectorby);
        inspector.click();

        WebElement personal = driver.findElement(personalby);
        personal.click();

        WebElement logo = driver.findElement(logoby);
        logo.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.kektura.hu/");
    }
}
