package tests.searchapartments;

import tests.base.BaseTest;

public class SearchApartTest extends BaseTest {

    public void checkIsRedrestToListing(){
        basePage.open("http://realt.by");
    }

    realtHomePage
            .enterCountRooms()
            .clickToFind();

    realListingPage
            . checkCountCards();
}
