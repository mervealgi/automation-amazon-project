import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage{

    By searhBoxLocator = By.id("twotabsearchtextbox");
    By searchButtonLocator = By.id("nav-search-submit-button");

    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        type(searhBoxLocator, text);
        click(searchButtonLocator);
    }
}
