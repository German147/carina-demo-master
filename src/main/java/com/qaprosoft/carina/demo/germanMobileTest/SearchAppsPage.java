package com.qaprosoft.carina.demo.germanMobileTest;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SearchAppsPage extends AbstractUIObject {

    @FindBy(id = "com.android.chrome:id/url_bar")
    private ExtendedWebElement searchBar;

    @FindBy(id = "com.android.chrome:id/line_1")
    private ExtendedWebElement androidText;

    public SearchAppsPage(WebDriver driver) {
        super(driver);
    }

    public void setTextOnSearchBar(String text) {
        searchBar.type(text);
    }

    public SearchingPageGoogle clickAndroidText(){
        androidText.click();
        return new SearchingPageGoogle(getDriver());
    }


}
