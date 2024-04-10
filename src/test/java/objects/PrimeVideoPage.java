package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrimeVideoPage extends BasePage{
    public PrimeVideoPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getStuff(){
        return driver.findElement(By.xpath("//*[contains (text(), \"My Stuff\")]/.."));
    }
    public WebElement getLogo(){
        return driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]"));
    }
}
