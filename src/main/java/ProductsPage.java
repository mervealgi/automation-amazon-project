import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage{

    By verifiedSearchLocator = By.cssSelector("span[class='a-color-state a-text-bold']");
    By productNameLocator = By.cssSelector("span[class='a-size-medium a-color-base a-text-normal']");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage() {
        return isDisplayed(verifiedSearchLocator);
    }

    public void selectProduct(int i) {
        getAllProducts().get(i).click();
    }

    private List<WebElement> getAllProducts(){
        findAll(productNameLocator);
    }
}
