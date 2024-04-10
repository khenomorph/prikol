package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PlushPage extends BasePage{
    public PlushPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getByingOptionsBtn() {
        return driver.findElement(By.xpath("//span[@class=\"a-button a-spacing-base a-button-base\"]/span/a"));
    }

    public WebElement getAddToCart(){
        return driver.findElement(By.xpath("(//input[@name=\"submit.addToCart\"])[1]"));
    }
}
