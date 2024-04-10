package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage extends BasePage{
    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getCreateAccntBtn(){
        return driver.findElement(By.xpath("//*[@id=\"createAccountSubmit\"]"));
    }
    public WebElement getLogo(){
        return driver.findElement(By.xpath("//i[@aria-label=\"Amazon\"]"));
    }
}
