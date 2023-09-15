package com.qaprosoft.carina.demo.germanMobileTest;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import static com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type.ANDROID_PHONE;


@DeviceType(pageType = ANDROID_PHONE,parentClass = AbstractUIObject.class)
public class HomePageGer extends AbstractUIObject {

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Chrome\"]")
    private ExtendedWebElement googleBar;


    public HomePageGer(WebDriver driver) {
        super(driver);
    }

    public SearchAppsPage clickOnGoogleBar(){
        googleBar.click();
        return new SearchAppsPage(getDriver());

    }
}
