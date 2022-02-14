package pages;


import Utilities.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageResult1 extends BasePage {

    WebDriver driver;
    WebElement element;
    Utilities utilities = new Utilities(driver);

    // press the list
    @FindBy(xpath = "//header/div[@id='navbar']/div[@id='nav-main']/div[1]/a[1]/i[1]")
    WebElement pressOnList;

    public SearchPageResult1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getPressOnList(){
        return pressOnList;
    }

}