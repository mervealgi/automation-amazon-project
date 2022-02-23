import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class add_product_to_card {

    HomePage homePage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;

    @Test
    public void search_the_product(){
        homePage.searchBox().search("book");
        Assertions.assertTrue(productsPage.isOnProductPage(),"Not on the products page");
    }

    @Test
    public void select_the_product(){
        productsPage.selectProduct(1);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),"Not on product detail page!");
    }

    @Test
    public void add_product_to_cart(){
        productDetailPage.addToCart();
        Assertions.assertTrue(homePage.isProductCounted(), "Product didnt add");
    }

    @Test
    public void view_cart(){
        homePage.goToCart();
        Assertions.assertTrue(cartPage.checkIfProductAdded(), "Product didnt added to cart");
    }

}
