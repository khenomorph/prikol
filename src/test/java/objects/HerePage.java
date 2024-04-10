package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HerePage extends BasePage{
    public HerePage(WebDriver driver) {
        super(driver);
    }
    public WebElement getPlaybook(){
        return driver.findElement(By.xpath("(//*[contains (text(), \"Get Playbook\")])[2]"));
    }
    public WebElement getText(){
        return driver.findElement(By.xpath("//*[@class=\"text align-start color-squid-ink font-size-medium ember font-normal\"]"));
    }
}
