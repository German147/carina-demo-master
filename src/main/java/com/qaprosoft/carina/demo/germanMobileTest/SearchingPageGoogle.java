package com.qaprosoft.carina.demo.germanMobileTest;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SearchingPageGoogle extends AbstractUIObject {


    @FindBy(id = "com.android.chrome:id/url_bar")
    private ExtendedWebElement searchBar;
    public SearchingPageGoogle(WebDriver driver) {
        super(driver);
    }

    public String searchBarGetText(){
        return searchBar.getText();
    }
}
