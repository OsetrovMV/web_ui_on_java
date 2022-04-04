package com.geekbrains.lesson6.homework6;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StihPage extends BaseView {

    public StihPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='poem-btn add-like']")
    private WebElement addLikeStih;

    @FindBy(xpath = "//div[@class='poem-btn likes-added']")
    private WebElement addedLikeStih;

    public LikePage likeStihClick() {
        addLikeStih.click();
        return new LikePage(driver);
    }
}
