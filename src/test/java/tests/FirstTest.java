package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.InitializePage;

import java.io.IOException;


public class FirstTest extends InitializePage {

    @BeforeTest
    public void setUp() {
        super.setUp();
    }
    // the test get title and compar with the expected
    @Test(priority = 1)
    public void searchItemInAmazon5() throws InterruptedException {
        String expected = "Amazon.com. שלמו פחות, חייכו יותר.";
        String actual = driver.getTitle();
        System.out.println(actual);
        Assert.assertEquals(actual,expected);
    }

    //The test Checking whether the Amazon logo exists
    @Test(priority = 2)
    public void searchItemInAmazon() throws InterruptedException {
        WebElement amazonLogo = driver.findElement(By.id("nav-logo-sprites"));
        Assert.assertEquals(searchPage.checkAmazonLogo(),amazonLogo);
        Thread.sleep(4000);
    }

   //The test enters the text box and typing polo shirts and check polo shirt for mens exists
    @Test(priority = 3)
    public void searchItemInAmazon1() throws InterruptedException {
        WebElement inputBox = searchPage2.inpuBox();
        homePage.searchInput("polo shirt");
        Assert.assertTrue(utilities.isElementPresent("//body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/span[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/span[1]/a[1]/span[1]","XPath"));
        Thread.sleep(4000);
    }


    // The test Clicks on the "All" icon and checks if is displayed
    @Test(priority = 4)
    public void searchItemInAmazon2() throws InterruptedException {
        searchPage1.getPressOnList().click();
        Assert.assertTrue(searchPage1.getPressOnList().isDisplayed(),"BAR ISN'T PRESS ");
        Thread.sleep(4000);
    }

    //Clears the search box and puts another value in and sends an order to a shopping cart and check that it exists
    @Test(priority = 5)
    public void searchItemInAmazon3() throws InterruptedException {
        WebElement inputBox = searchPage2.inpuBox();
        homePage.clearAndClickInput("womens dresses");
        searchPage2.cDresse().click();
        searchPage2.addButton().click();
        searchPage2.cart().click();
        Assert.assertEquals(searchPage2.check().getText(),"במלאי");
    }

    //the test check if espanol language isdisolayed
    @Test(priority = 6)
    public void searchItemInAmazon4() throws InterruptedException {
         utilities.getElement("icp-nav-flyout","id").click();
         searchPage.laguage().click();
         searchPage.esp().click();
         boolean select = searchPage.change().isDisplayed();
         Assert.assertTrue(select);
    }

    // the test opens an account in amazon
    @Test(priority = 7)
    public void searchItemInAmazon6() throws InterruptedException {
       searchPage3.getAcountTital().click();
       searchPage3.getNewAcountOpen().click();
       searchPage3.getNameBox().sendKeys("dan choen");
       searchPage3.getMailBox().sendKeys("danchoen1@walla.com");
       searchPage3.getPasswordBox().sendKeys("ww@123456");
       searchPage3.getPasswordBoxCheck().sendKeys("ww@123456");
       searchPage3.getContinue1().submit();
       Assert.assertEquals(searchPage3.count(),"יש לפתור את החידה כדי להגן על החשבון שלך");
    }



    public void tearDown() throws IOException {
        // utilities.screenshot();
        super.tearDown();
    }
}