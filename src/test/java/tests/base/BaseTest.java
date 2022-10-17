package tests.base;
import common.CommonAction;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import pages.base.BasePage;
import pages.listing.RealListingPage;
import pages.realhome.RealHomePage;



public class BaseTest {
    protected WebDriver driver = CommonAction.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected RealHomePage realHomePage = new RealHomePage(driver);
    protected RealListingPage realListingPage = new RealListingPage(driver);

  //  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

@AfterSuite(alwaysRun = true)
    public void quit(){
        driver.quit();
    }


}

