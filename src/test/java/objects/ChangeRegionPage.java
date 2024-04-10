package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChangeRegionPage extends BasePage{
    public ChangeRegionPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getChangeRegionDropBox(){
        return driver.findElement(By.xpath("//*[@class=\"a-button-text a-declarative\"]"));
    }
    public WebElement changeRegion(){
        return driver.findElement(By.xpath("//*[@id=\"icp-dropdown_14\"]"));
    }

    public WebElement goToWebsite(){
        return driver.findElement(By.xpath("//*[@id=\"icp-save-button\"]"));
    }
}
