package com.qaprosoft.carina.demo.service;

import com.qaprosoft.carina.demo.gui.pages.BrandModelsPage;
import com.qaprosoft.carina.demo.gui.pages.HomePage;
import com.qaprosoft.carina.demo.gui.pages.ModelInfoPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public interface IPhoneModelService {
    public default ModelInfoPage getModelInfoPage(WebDriver driver,String brand, String model){
        // Open GSM Arena home page and verify page is opened
        HomePage homePage = new HomePage(driver);
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");

        //Closing advertising if it's displayed
        homePage.getWeValuePrivacyAd().closeAdIfPresent();

        // Select phone brand
        homePage = new HomePage(driver);
        BrandModelsPage productsPage = homePage.selectBrand("Samsung");


        // Select phone model
        ModelInfoPage productInfoPage = productsPage.selectModel("Galaxy A52 5G");
        return productInfoPage;
    }
}
