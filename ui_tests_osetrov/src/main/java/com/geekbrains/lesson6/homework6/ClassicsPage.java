package com.geekbrains.lesson6.homework6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClassicsPage extends BaseView {
    public ClassicsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@href = '/mayakovskij']")
    private WebElement authorMayakovskijBlock;

    public MayakovskijPage authorMayakovskijClick() {
        authorMayakovskijBlock.click();
        return new MayakovskijPage(driver);
    }

}
