import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import pages.EBayHomePage;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;
    public static final String URL = "https://www.ebay.com.au/";
    EBayHomePage homePage;

    @BeforeTest
    @Parameters(value={"browser"})
    public void setupTest(String browser){

        if (browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
            driver = new ChromeDriver();
        }else if(browser.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", "src/driver/geckodriver.exe");
            driver = new FirefoxDriver();
        }

        //able to extend to cover more browser and selenium grid
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(URL);
        homePage = new EBayHomePage(driver);
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
