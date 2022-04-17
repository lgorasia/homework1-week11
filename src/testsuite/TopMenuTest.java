package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }

    @Test
    //locate computers
    public void userShouldNavigateToComputerPageSuccessfully() {
        WebElement computerLocater = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"));
        computerLocater.click();
        //this is requirement
        String expectedText = "Computers";
        //finding actual text
        WebElement actualTextElement = driver.findElement(By.tagName("h1"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
//locate electonics
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        WebElement computerLocater = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]"));
        computerLocater.click();
        //this is requirement
        String expectedText = "Electronics";
        //finding actual text
        WebElement actualTextElement = driver.findElement(By.tagName("h1"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        WebElement computerLocater = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1]"));
        computerLocater.click();
        //this is requirement
        String expectedText = "Apparel";
        //finding actual text
        WebElement actualTextElement = driver.findElement(By.tagName("h1"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        WebElement computerLocater = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[4]/a[1]"));
        computerLocater.click();
        //this is requirement
        String expectedText = "Digital downloads";
        //finding actual text
        WebElement actualTextElement = driver.findElement(By.tagName("h1"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        WebElement computerLocater = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]"));
        computerLocater.click();
        //this is requirement
        String expectedText = "Books";
        //finding actual text
        WebElement actualTextElement = driver.findElement(By.tagName("h1"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        WebElement computerLocater = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]"));
        computerLocater.click();
        //this is requirement
        String expectedText = "Jewelry";
        //finding actual text
        WebElement actualTextElement = driver.findElement(By.tagName("h1"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        WebElement computerLocater = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]"));
        computerLocater.click();
        //this is requirement
        String expectedText = "Gift Cards";
        //finding actual text
        WebElement actualTextElement = driver.findElement(By.tagName("h1"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText, actualText);
    }


}