package com.geekbrains.lesson6.homework6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BaseView {
    @FindBy (xpath = "//span[@class='header-icon icon-profile']")
    WebElement profileButton;

    public LoginPage clickProfileButton () {
        profileButton.click();
        return new LoginPage(driver);
    }

    public MainPage(WebDriver driver) {
        super(driver);
    }

}
