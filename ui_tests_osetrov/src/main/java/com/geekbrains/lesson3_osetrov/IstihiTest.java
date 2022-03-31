package com.geekbrains.lesson3_osetrov;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IstihiTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver newDriver = new ChromeDriver();
        newDriver.get("https://istihi.ru/");

        //WebElement loginButton = newDriver.findElement(By.xpath(//span[@class="header-icon icon-profile"]));
       // loginButton.click();
        newDriver.findElement(By.id("user-settings")).click();
        newDriver.findElement(By.name("User_User[e_mail]")).sendKeys("igrok-17@mail.ru");
        newDriver.findElement(By.name("User_User[password]")).sendKeys("123456");
        newDriver.findElement(By.xpath("//button[.='Войти']")).click();
        newDriver.findElement(By.xpath("//input[@class ='header-search-input']")).sendKeys("Пушкин");
        newDriver.findElement(By.id("search-2-line_1_")).click();
        newDriver.findElement(By.xpath("//a[.='Пушкин  Александр  Сергеевич']")).click();

        Thread.sleep(5000);

        newDriver.quit();
    }
}
