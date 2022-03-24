package com.geekbrains.lesson3_osetrov;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstStart {
    public static void main(String[] args) throws InterruptedException {
        /*
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver newDriver = new ChromeDriver();
        newDriver.get("https://www.google.com");
        Thread.sleep(5000);
         */

        WebDriverManager.chromedriver().setup();
        WebDriver newDriver = new ChromeDriver();
        newDriver.get("https://www.google.com");
        Thread.sleep(5000);

        newDriver.quit();
    }
}
