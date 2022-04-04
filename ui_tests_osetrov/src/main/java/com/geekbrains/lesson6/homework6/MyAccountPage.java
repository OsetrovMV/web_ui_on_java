package com.geekbrains.lesson6.homework6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BaseView {

    public MyAccountPage(WebDriver driver) {
        super(driver);
        classicsBlock = new ClassicsPage(driver);
    }

    public ClassicsPage classicsBlock;

    @FindBy(xpath = "//a[@href = '/authors']")
    private WebElement classicsButton;

    public ClassicsPage classicsBlockClick() {
        classicsButton.click();
        return new ClassicsPage(driver);
    }
}
