import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage{

    By searchBoxLocator = By.id("twotabsearchtextbox");
    By searchButtonLocator = By.id("nav-search-submit-button");

    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        this.type(searchBoxLocator, text);
        this.click(searchButtonLocator);
    }
}
