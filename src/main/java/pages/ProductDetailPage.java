package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDetailPage extends Page {

    @FindBy(how = How.ID, using = "msku-sel-1")
    @CacheLookup
    private WebElement colorSelect;

    @FindBy(how = How.CSS, using = "#isCartBtn_btn")
    private WebElement addToCartBtn;

    public ProductDetailPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    /**
     * select color from drop down list
     * @param color
     */
    public void selectProductColor(String color){
        Select select = new Select(colorSelect);
        select.selectByVisibleText(color);
    }

    public void addToShoppingCart(){
        addToCartBtn.click();
    }

    /**
     * return shopping cart item number
     * @return
     */
    public String getShoppingCartItemNumber(){
        WebDriverWait wait = new WebDriverWait(getWebDriver(), 10);
        WebElement shoppingCart = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("gh-cart-n")));
        return shoppingCart.getText();
    }
}
