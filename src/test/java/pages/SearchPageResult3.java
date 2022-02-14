package pages;

import Utilities.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageResult3 extends BasePage{
    WebDriver driver;
    WebElement element;
    Utilities utilities = new Utilities(driver);

    //elements for opening an account in amazon
    @FindBy(xpath = "//body[1]/div[1]/header[1]/div[1]/div[1]/div[3]/div[1]/a[2]/div[1]/span[1]")
    WebElement acountTital;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/span[1]/span[1]/a[1]")
    WebElement newAcountOpen;

    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
    WebElement count;

    @FindBy(css = "#ap_customer_name")
    WebElement nameBox;

    @FindBy(css = "#ap_email")
    WebElement mailBox;

    @FindBy(css = "#ap_password")
    WebElement passwordBox;

    @FindBy(css = "#ap_password_check")
    WebElement passwordBoxCheck;

    @FindBy(css = "#continue")
    WebElement continue1;

    public SearchPageResult3(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getAcountTital(){
        return acountTital;
    }

    public  WebElement getNewAcountOpen(){
        return newAcountOpen;
    }
    public String count(){
        String c = count.getText();
        return c;
    }
    public WebElement getNameBox(){
        return nameBox;
    }
    public WebElement getMailBox(){
        return mailBox;
    }
    public WebElement getPasswordBox(){
        return passwordBox;
    }
    public WebElement getPasswordBoxCheck(){
        return passwordBoxCheck;
    }
    public WebElement getContinue1(){
        return continue1;
    }
}
