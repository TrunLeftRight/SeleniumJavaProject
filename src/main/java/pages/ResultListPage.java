package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ResultListPage extends Page {

    @FindBy(how = How.ID, using = "ListViewInner")
    @CacheLookup
    private WebElement listResultsUl;

    @FindBy(how = How.CSS, using = "#ListViewInner > li:first-of-type a")
    private WebElement firstResultA;

    public ResultListPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public ProductDetailPage selectFirstResultItem(){
        firstResultA.click();
        return new ProductDetailPage(getWebDriver());
    }


}
