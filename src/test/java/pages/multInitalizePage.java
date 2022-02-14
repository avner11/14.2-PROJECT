package pages;

import Utilities.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.IOException;

public class multInitalizePage {

    public WebDriver driver;
    public HomePage homePage;
    public SearchPageResult searchPage;
    public SearchPageResult1 searchPage1;
    public SearchPageResult2 searchPage2;
    public SearchPageResult3 searchPage3;
    public Utilities utilities;

    // setup for multiple browser
    @Parameters("browserName")
    @BeforeTest
    public void setUp(String browserName) {
        String baseUrl = "https://www.amazon.com/";
        if (browserName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "C:\\SELENUM\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }else if(browserName.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver", "C:\\Users\\User\\Downloads\\edgedriver_win64\\msedgedriver.exe");
            driver = new EdgeDriver();
        }else {
            System.setProperty("webdriver.chrome.driver", "C:\\SELENUM\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }

        homePage = new HomePage(driver);
        searchPage = new SearchPageResult(driver);
        searchPage1 = new SearchPageResult1(driver);
        searchPage2 = new SearchPageResult2(driver);
        searchPage3 = new SearchPageResult3(driver);

        utilities = new Utilities(driver);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        System.out.println("It will look for Element in amazon");
    }
    @AfterTest
    public void tearDown() throws IOException {
        driver.quit();
    }
}
