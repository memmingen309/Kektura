package Pages;

import Driver.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends DriverBase {
    WebDriver driver;
    WebDriverWait wait;

    By cookieby = By.xpath("//*[@id=\"cookie-consent-dialog\"]/div[2]/div/div[3]/a[1]");

    public HomePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void loadHomePage(){
        driver.get("https://www.kektura.hu/");
        WebElement acceptCookie = driver.findElement(cookieby);
        acceptCookie.click();
    }
}
