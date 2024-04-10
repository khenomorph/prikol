package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ArabianAmazomPage extends BasePage{
    public ArabianAmazomPage(WebDriver driver) {
        super(driver);
    }

   public List<WebElement> getCategory(){
        return driver.findElements(By.xpath("//*[@class=\"a-list-item\"]"));
   }
}
