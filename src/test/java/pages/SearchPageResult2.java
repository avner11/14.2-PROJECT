package pages;


import Utilities.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageResult2 extends BasePage {

    WebDriver driver;
    WebElement element;
    Utilities utilities = new Utilities(driver);

    //text box
    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    WebElement inputBox;

    // Stock
    @FindBy(xpath ="//primary[contains(text(),'במלאי')]")
    WebElement check;

    //the chosen dress
    @FindBy(xpath = "//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/h2[1]/a[1]/span[1]")
    WebElement cDresse;

    //order press button
    @FindBy(id = "add-to-cart-button")
    WebElement addButton;

    //order cart
    @FindBy(id = "nav-cart-count")
    WebElement cart;



    public SearchPageResult2(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public WebElement check() {
          return check;
    }

    public WebElement inpuBox() {
        return inputBox;
    }
    public WebElement cDresse() {
        return cDresse;
    }
    public WebElement addButton() {
        return addButton;
    }
    public WebElement cart() {
        return cart;
    }

}