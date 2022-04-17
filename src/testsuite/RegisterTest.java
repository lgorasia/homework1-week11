package testsuite;

import browserfactory.BaseTest;
import org.checkerframework.checker.units.qual.A;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest extends BaseTest {
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
    public void userShouldNavigateToRegisterPageSuccessfully() {
        // Locate registration link and click the link
        WebElement registrationlink = driver.findElement(By.linkText("Register"));
        registrationlink.click();
        //This is from requirement
        String expectedMessage = "Register";
        // find the Register text
        WebElement actualMessageElement = driver.findElement(By.tagName("h1"));
        String actualmessage = actualMessageElement.getText();
        Assert.assertEquals(expectedMessage,actualmessage);
    }
    @Test
    public void userSholdRegisterAccountSuccessfully(){
        // Locate registration link and click the link
        WebElement registrationlink = driver.findElement(By.linkText("Register"));
        registrationlink.click();
        //select gender radio button
        WebElement findRadioBtn =driver.findElement(By.id("gender-male"));
        findRadioBtn.click();
        // select first name
        WebElement firstNameField =driver.findElement(By.id("FirstName"));
        firstNameField.sendKeys("Lalit");
        // select Last name
       WebElement lastNameField = driver.findElement(By.id("LastName"));
       lastNameField.sendKeys("Patell");
       //select day
       Select dayField = new Select (driver.findElement(By.name("DateOfBirthDay")));
       dayField.selectByVisibleText("29");
       // select month
        Select monthField = new Select (driver.findElement(By.name("DateOfBirthMonth")));
        monthField.selectByVisibleText("May");
        //select year
       Select yearField = new Select( driver.findElement(By.name("DateOfBirthYear")));
       yearField.selectByVisibleText("1984");
       //enter email
        WebElement emailField =driver.findElement(By.id("Email"));
        emailField.sendKeys("abcde@gmail.com");
        //enter password
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("123456789");
        // confirm password
        WebElement confirmPasswordField = driver.findElement(By.id("ConfirmPassword"));
        confirmPasswordField.sendKeys("123456789");
        //Click the register button
        WebElement registerBtn = driver.findElement(By.id("register-button"));
        registerBtn.click();

        //Find registration completion page
       String expectedMessage = "Your registration completed";
       WebElement actualMessageElement = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
       String actualMessage = actualMessageElement.getText();
       Assert.assertEquals(expectedMessage,actualMessage);
    }
}
