package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

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
    public void userShouldNavigateToLoginPageSuccessfully() {
        //find longin link
        WebElement longinLink = driver.findElement(By.linkText("Log in"));
        longinLink.click();
        // required message
        String expectedMessage = "Welcome, Please Sign In!";
        //find welcome text element and get the text
        WebElement actaulMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualMessage = actaulMessageElement.getText();
        // varification
        Assert.assertEquals("Not nevigate to lonin page", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //find longin link
        WebElement longinLink = driver.findElement(By.linkText("Log in"));
        longinLink.click();
        //find email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("abcde@gmail.com");
        //find password field
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("123456789");
        //find login button and click
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginButton.click();
        //find log out text
        String expectedText = "Log out";
        // find actual text
        WebElement actualTextElement =driver.findElement(By.linkText("Log out"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText,actualText);


    }

    @Test
    public void verifyTheErrorMessage() {
        //find longin link
        WebElement longinLink = driver.findElement(By.linkText("Log in"));
        longinLink.click();
        //find email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("ljpatel@yahoo.com");
        //find password field
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("abc123456");
        //find login button and click
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginButton.click();
        // required message
        String expectedmessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        WebElement actualMessageElement = driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]"));
        String actalMessage = actualMessageElement.getText();

        Assert.assertEquals(expectedmessage, actalMessage);


    }
}