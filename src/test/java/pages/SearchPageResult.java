package pages;


import Utilities.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageResult extends BasePage {

    WebDriver driver;
    WebElement element;
    Utilities utilities = new Utilities(driver);

    // amazon logo
    @FindBy(xpath = "//a[@id='nav-logo-sprites']")
    WebElement amazonLogo;
    // language bar
    @FindBy(id = "icp-nav-flyout")
    WebElement searchLanguage;
    // the language
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/label[1]/i[1]")
    WebElement especial;
    //change the language in the bar
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/form[1]/span[2]/span[1]/input[1]")
    WebElement change;



    public SearchPageResult(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement checkAmazonLogo() {
        return amazonLogo;
    }


    public WebElement laguage(){
        return searchLanguage;
    }

    public WebElement esp() {
        return especial;
    }
    public WebElement change(){
        return change;
    }

}