package objects;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class BasePage {
    WebDriver driver;

    protected  final Duration duration = Duration.ofSeconds(5);

    public BasePage(WebDriver driver){
        this.driver = driver;
    }
}
