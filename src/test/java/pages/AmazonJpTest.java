package pages;

import objects.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Set;

public class AmazonJpTest extends TestInit {
    @Test
    public void SearchTest(){
        HomePage homePage = new HomePage(driver);
        homePage.getSrchFd().sendKeys("animal crossing\n");
        SearchPage searchPage = new SearchPage(driver);
        searchPage.getPlush().click();
        PlushPage plushPage = new PlushPage(driver);
        Set<String> windowHandles = driver.getWindowHandles();
        ArrayList<String> tabs = new ArrayList<>(windowHandles);
        driver.switchTo().window(tabs.get(1));
        plushPage.getByingOptionsBtn().click();
        sleep(3);
        WebElement abuba = plushPage.getAddToCart();
        abuba.click();
    }

    @Test
    public void CheckSignUpTest(){
        HomePage homePage = new HomePage(driver);
        homePage.getSignUpLink().click();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.getCreateAccntBtn().click();
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        createAccountPage.setName().sendKeys("12345678 njhgghhh");
        createAccountPage.setPhoneNumber().sendKeys("+380667816467");
        createAccountPage.setPsswrd().sendKeys("jhgfdh");
        createAccountPage.checkPsswrd().sendKeys("jhgfdh");
        createAccountPage.getContinue().click();
        Assert.assertTrue(createAccountPage.setPhoneNumber().isDisplayed());
        Assert.assertFalse(createAccountPage.checkPsswrd().isSelected());
    }

    @Test
    public void ChangeRegionTest(){
        HomePage homePage = new HomePage(driver);
        homePage.getRegionBtn().click();
        ChangeRegionPage changeRegionPage = new ChangeRegionPage(driver);
        changeRegionPage.getChangeRegionDropBox().click();
        changeRegionPage.changeRegion().click();
        changeRegionPage.goToWebsite().click();
        ArabianAmazomPage arabianAmazomPage = new ArabianAmazomPage(driver);
        Assert.assertFalse(arabianAmazomPage.getCategory().size() > 100);
    }

    @Test
    public void SeeMoreTest(){
        HomePage homePage = new HomePage(driver);
        homePage.getSeeMore().click();
        GodzillaPage godzillaPage = new GodzillaPage(driver);
        godzillaPage.getCathegory().click();
        godzillaPage.getPrimeVideo().click();
        PrimeVideoPage primeVideoPage = new PrimeVideoPage(driver);
        primeVideoPage.getLogo().click();
        Assert.assertTrue(homePage.checkBott().isDisplayed());
        Assert.assertFalse(homePage.checkBott().isSelected());
    }

    @Test
    public void MakeMoneyWithUsTest(){
        HomePage homePage =new HomePage(driver);
        homePage.checkMoney().click();
        SellingItemsPage sellingItemsPage = new SellingItemsPage(driver);
        sellingItemsPage.getHere().click();
        HerePage herePage = new HerePage(driver);
        Assert.assertTrue(herePage.getPlaybook().isDisplayed());
        Assert.assertFalse(herePage.getText().equals(10));
    }
}
