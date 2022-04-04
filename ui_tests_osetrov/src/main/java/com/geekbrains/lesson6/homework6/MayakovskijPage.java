package com.geekbrains.lesson6.homework6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MayakovskijPage extends BaseView {

    public MayakovskijPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@itemtype= 'https://schema.org/WebSite']")
    private WebElement MayakovskijBlock;

    @FindBy(xpath = "//a[.='Встреча в Копенгагене']")
    private WebElement stihVstrechaVKopengagene;

    public StihPage stihVstrechaVKopengageneClick() {
        stihVstrechaVKopengagene.click();
        return new StihPage(driver);
    }
}
