package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
        String baseUrl = "https://demo.nopcommerce.com/";

        @Before
        public void setUp(){
                openBrowser(baseUrl);
        }

        @Test
        public void userShouldNavigateToRegisterPageSuccessfully(){
//        * click on the ‘Register’ link
                WebElement registerButton = driver.findElement(By.className("ico-register"));
                registerButton.click();
//        * Verify the text ‘Register’
                String actualResult = driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
                System.out.println(actualResult);
                String expectedResult = "Register";
                Assert.assertEquals(actualResult,expectedResult);
        }
        @Test
        public void userShouldRegisterAccountSuccessfully(){
//        * click on the ‘Register’ link
                WebElement registerButton = driver.findElement(By.className("ico-register"));
                registerButton.click();
//        * Select gender radio button
                WebElement genderRadioButton = driver.findElement(By.className("male"));
                genderRadioButton.click();
//        * Enter First name
                WebElement firstNameField = driver.findElement(By.id("FirstName"));
                firstNameField.sendKeys("Rushit");
//        * Enter Last name
                WebElement lastNameField = driver.findElement(By.id("LastName"));
                lastNameField.sendKeys("Patel");
//        * Select Day Month and Year
//        * Enter Email address
                WebElement emailLoginField = driver.findElement(By.id("Email"));
                emailLoginField.sendKeys("rushitp93@gmail.com");
//        * Enter Password
                WebElement passwordField = driver.findElement(By.id("Password"));
                passwordField.sendKeys("Rushit@70");
//        * Enter Confirm password
                WebElement confirmPasswordField = driver.findElement(By.id("ConfirmPassword"));
                confirmPasswordField.sendKeys("Rushit@70");
//        * Click on REGISTER button
                WebElement register = driver.findElement(By.xpath("//button[@class='button-1 register-next-step-button']"));
                register.click();
//        * Verify the text 'Your registration completed’
                String actualResult = driver.findElement(By.className("result")).getText();
                System.out.println(actualResult);
                String expectedResult = "Your registration completed";
                Assert.assertEquals(actualResult,expectedResult);
        }
        @After
        public void endTest(){
                //closeBrowser();
        }
}
