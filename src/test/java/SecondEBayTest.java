import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductDetailPage;
import pages.ResultListPage;

public class SecondEBayTest extends TestBase{
    @Test
    public void nintendoSwitchTest(){
        ResultListPage resultListPage =  homePage.searchProducts("nintendo switch console");
        ProductDetailPage detailPage = resultListPage.selectFirstResultItem();
        detailPage.selectProductColor("Blue");
        detailPage.addToShoppingCart();
        Assert.assertTrue(detailPage.getShoppingCartItemNumber().contains("1"));
    }
}
