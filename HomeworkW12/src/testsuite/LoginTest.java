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
        public void setUp(){
                openBrowser(baseUrl);
        }

        @Test
        public void userShouldNavigateToLoginPageSuccessfully(){
//        * click on the ‘Login’ link
                WebElement loginLink = driver.findElement(By.className("ico-login"));
                loginLink.click();
//                * Verify the text ‘Welcome, Please Sign In!’
                String actualResult = driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
                System.out.println(actualResult);
                String expectedResult = "Welcome, Please Sign In!";
                Assert.assertEquals(actualResult,expectedResult);
        }
        @Test
        public void userShouldLoginSuccessfullyWithValidCredentials(){
                //            * click on the ‘Login’ link
                WebElement loginLink = driver.findElement(By.className("ico-login"));
                loginLink.click();
//                * Enter valid username
//                * Enter valid password
                WebElement emailLoginField = driver.findElement(By.id("Email"));
                emailLoginField.sendKeys("rushitp93@gmail.com");
                WebElement passwordField = driver.findElement(By.id("Password"));
                passwordField.sendKeys("Rushit@70");
//      * Click on ‘LOGIN’ button
                WebElement login = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
                login.click();
                //       * Verify the ‘Log out’ text is display
                String logout = driver.findElement(By.className("ico-logout")).getText();
                System.out.println(logout);
        }
        @Test
        public void verifyTheErrorMessage(){
//                * click on the ‘Login’ link
                WebElement loginLink = driver.findElement(By.className("ico-login"));
                loginLink.click();
//                * Enter invalid username
//                * Enter invalid password
                WebElement emailLoginField = driver.findElement(By.id("Email"));
                emailLoginField.sendKeys("rushit70@hotmail.com");
                WebElement passwordField = driver.findElement(By.id("Password"));
                passwordField.sendKeys("Rushit@93");
//                * Click on Login button
                WebElement login = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
                login.click();
//                * Verify the error message ‘Login was unsuccessful.
//                Please correct the errors and try again. No customer account found’
                String actualResult = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
                System.out.println(actualResult);
                String expectedResult = "Login was unsuccessful. Please correct the errors and try again.\n" +
                        "No customer account found";
                Assert.assertEquals(actualResult,expectedResult);
        }
        @After
        public void endTest(){
                // closeBrowser();
        }



}
