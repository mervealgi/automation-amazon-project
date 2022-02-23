import org.openqa.selenium.WebDriver;

import javax.naming.directory.DirContext;

public class HomePage extends BasePage{

    SearchBox searchBox;

    public HomePage(WebDriver driver){
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox(){
        return this.searchBox;
    }

    public boolean isProductCounted(){
        return false;
    }

    public void goToCart(){
    }
}
