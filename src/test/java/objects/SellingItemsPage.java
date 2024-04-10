package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SellingItemsPage extends BasePage{
    public SellingItemsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getHere(){
        return driver.findElement(By.xpath("//*[@href=\"https://sell.amazon.co.jp/grow#nsi\"][contains (text(), \"here\")]"));
    }
}
