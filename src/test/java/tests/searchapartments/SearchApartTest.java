package tests.searchapartments;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class SearchApartTest extends BaseTest {

    @Test(timeOut = 5000)
    public void checkIsRedrectToListing(){

        basePage.open("https://realt.by/");
       // switchWindow();
        realHomePage
                .enterCountRoom()
                .clickToFind();
        realListingPage
                .checkCountCards();

    }
}
