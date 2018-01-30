import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductDetailPage;
import pages.ResultListPage;

public class FirstEBayTest extends TestBase{
    @Test
    public void googleHomeMiniTest() {
        ResultListPage resultListPage =  homePage.searchProducts("google home mini black");
        ProductDetailPage detailPage = resultListPage.selectFirstResultItem();
        detailPage.selectProductColor("White");
        detailPage.addToShoppingCart();
        Assert.assertTrue(detailPage.getShoppingCartItemNumber().contains("1"));
    }
}
