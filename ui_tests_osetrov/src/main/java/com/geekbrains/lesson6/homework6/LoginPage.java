package com.geekbrains.lesson6.homework6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseView {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//input[@name='User_User[e_mail]']")
    private WebElement emailField;

    @FindBy (xpath = "//input[@name='User_User[password]']")
    private WebElement passwordField;

    @FindBy (xpath = "//button[@class='s-btn s-btn-green']")
    private WebElement submitButton;

    public MyAccountPage login (String email, String password) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        submitButton.click();
        return new MyAccountPage(driver);
    }
}
