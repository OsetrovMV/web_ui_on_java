package com.geekbrains.lesson3_osetrov;

import io.github.bonigarcia.wdm.WebDriverManager;
import javafx.scene.control.Tab;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;

import static org.openqa.selenium.WindowType.TAB;
import static org.openqa.selenium.WindowType.WINDOW;

public class SetupDriverExamples {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("user-agent=Googlebot/2.1 (+http://www.google.com/bot.html)");
        //chromeOptions.addArguments("--headless");
        WebDriver newDriver = new ChromeDriver(chromeOptions);
        newDriver.get("https://www.google.com");
        Thread.sleep(5000);

        //((JavascriptExecutor)newDriver).executeScript("window.open()");
        newDriver.switchTo().newWindow(TAB);

        List<String> tabs = new ArrayList<>(newDriver.getWindowHandles());
        newDriver.switchTo().window(tabs.get(1));
        Thread.sleep(4000);

        newDriver.close();

        Thread.sleep(4000);

        newDriver.quit();
    }
}
