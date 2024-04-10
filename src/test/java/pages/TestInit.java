package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {
    WebDriver driver = new ChromeDriver();

    public void sleep(int seconds){
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    @BeforeMethod
    public void SetUp(){

        driver.get("https://www.amazon.co.jp/");
        driver.manage().window().maximize();
        driver.getWindowHandle();

    }

    @AfterMethod
    public void TearDown(){
        driver.quit();
    }
}
