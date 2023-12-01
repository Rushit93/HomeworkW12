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
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
//        * click on the ‘Computers’ Tab
        WebElement computerTab = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[1]/a[1]"));
        computerTab.click();
//        * Verify the text ‘Computers’
        String actualResult = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[1]/a[1]")).getText();
        System.out.println(actualResult);
        String expectedResult = "Computers";
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
//        * click on the ‘Electronics’ Tab
        WebElement electronicsTab = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[2]/a"));
        electronicsTab.click();
//        * Verify the text ‘Electronics’
        String actualResult = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[2]/a")).getText();
        System.out.println(actualResult);
        String expectedResult = "Electronics";
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfull(){
//        * click on the ‘Apparel’ Tab
        WebElement apparelTab = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[3]/a"));
        apparelTab.click();
//        * Verify the text ‘Apparel’
        String actualResult = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[3]/a")).getText();
        System.out.println(actualResult);
        String expectedResult = "Apparel";
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfull(){
//        * click on the ‘Digital downloads’ Tab
        WebElement digitalDownloadsTab = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[4]/a"));
        digitalDownloadsTab.click();
//        * Verify the text ‘Digital downloads’
        String actualResult = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[4]/a")).getText();
        System.out.println(actualResult);
        String expectedResult = "Digital downloads";
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
//        * click on the ‘Books’ Tab
        WebElement booksTab = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[5]/a"));
        booksTab.click();
//        * Verify the text ‘Books’
        String actualResult = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[5]/a")).getText();
        System.out.println(actualResult);
        String expectedResult = "Books";
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
//        * click on the ‘Jewelry’ Tab
        WebElement jewelryTab = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[6]/a"));
        jewelryTab.click();
//        * Verify the text ‘Jewelry’
        String actualResult = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[6]/a")).getText();
        System.out.println(actualResult);
        String expectedResult = "Jewelry";
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfull(){
//        * click on the ‘Gift Cards’ Tab
        WebElement giftCardsTab = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[7]/a"));
        giftCardsTab.click();
//        * Verify the text ‘Gift Cards’
        String actualResult = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[7]/a")).getText();
        System.out.println(actualResult);
        String expectedResult = "Gift Cards";
        Assert.assertEquals(actualResult,expectedResult);
    }
    @After
    public void endTest(){
        // closeBrowser();
    }
}
