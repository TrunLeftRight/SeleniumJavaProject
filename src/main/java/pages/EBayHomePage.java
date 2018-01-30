package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EBayHomePage extends Page {

    @FindBy(how = How.ID, using = "gh-ac")
    @CacheLookup
    private WebElement searchInput;

    @FindBy(how = How.ID, using = "gh-btn")
    @CacheLookup
    private WebElement searchBtn;

    public EBayHomePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public ResultListPage searchProducts(String productName){
        searchInput.sendKeys(productName);
        searchBtn.click();
        return new ResultListPage(getWebDriver());
    }

}
