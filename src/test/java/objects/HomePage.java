package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public WebElement getSrchFd(){
        return driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
    }
    public WebElement getSignUpLink(){
        return driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
    }

    public WebElement getRegionBtn(){
        return driver.findElement(By.xpath("//*[@id=\"icp-touch-link-country\"]"));
    }

    public WebElement getSeeMore(){return driver.findElement(By.xpath("(//span[@class=\"a-truncate-cut\"])[2]"));}

    public WebElement checkBott(){return driver.findElement(By.xpath("//*[@class=\"icp-container-desktop\"]"));}

    public WebElement checkMoney(){return driver.findElement(By.xpath("//*[contains (text(), \"Sell products\")]"));}
}
