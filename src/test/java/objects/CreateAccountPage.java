package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccountPage extends BasePage{
    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    public WebElement setName(){
        return driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]"));
    }

    public WebElement setPhoneNumber(){
        return driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
    }

    public WebElement setPsswrd(){
        return driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
    }

    public WebElement checkPsswrd(){
        return driver.findElement(By.xpath("//*[@id=\"ap_password_check\"]"));
    }

    public WebElement getContinue(){
        return driver.findElement(By.xpath("//*[@id =\"continue\"]"));
    }
}
