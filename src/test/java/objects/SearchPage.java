package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage{
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getPlush(){return driver.findElement(By.xpath("//*[text() = \"Sanei Boeki Animal Crossing All Star Collection Jun (S), W 4.5 x D 5.5 x H 6.7 inches (11.5 x 14 x 17 cm), Plush Doll DP26\"]"));}
}
