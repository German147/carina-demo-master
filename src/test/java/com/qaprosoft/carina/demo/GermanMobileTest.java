package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.germanMobileTest.HomePageGer;
import com.qaprosoft.carina.demo.germanMobileTest.SearchAppsPage;
import com.qaprosoft.carina.demo.germanMobileTest.SearchingPageGoogle;
import com.zebrunner.agent.core.annotation.TestLabel;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class GermanMobileTest implements IAbstractTest, IMobileUtils {


    @Test
    @MethodOwner(owner = "barreragerman")
    @TestLabel(name = "reachingGoogle", value = {"mobile", "practice"})
    public void testReachingGoogleSearchBar() {
        HomePageGer homePageGer = new HomePageGer(getDriver());
        SearchAppsPage searchBar = homePageGer.clickOnGoogleBar();
        SearchingPageGoogle searchingPageGoogle = searchBar.clickAndroidText();
        String texOfBar = searchingPageGoogle.searchBarGetText();
        assertEquals(texOfBar,"google.com/search?q=android&oq=&aqs=chrome.0.69i59i450.-1j0j7&client=ms-unknown&sourceid=chrome-mobile&ie=UTF-8",
                "The page is incorrect");
    }
}
