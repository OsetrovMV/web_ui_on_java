package com.geekbrains.lesson6.homework6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LikePage extends BaseView {

    public LikePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "heart")
    private WebElement favourites;

    public void favouritesClick() {
        favourites.click();
    }
}
