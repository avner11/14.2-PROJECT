

package pages;

import Utilities.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    WebDriver driver;
    WebElement element;
    Utilities utilities = new Utilities(driver);
}