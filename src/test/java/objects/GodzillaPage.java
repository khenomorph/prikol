package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GodzillaPage extends BasePage{
    public GodzillaPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getPrimeVideo(){
        return driver.findElement(By.xpath("//*[text()=\"Prime Video\"][@class=\"a-size-base a-color-base\"]"));
    }
    public WebElement getCathegory(){
        return driver.findElement(By.xpath("//div[@id=\"n-title\"]"));
    }
}
