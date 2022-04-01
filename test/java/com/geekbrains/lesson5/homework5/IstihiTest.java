package com.geekbrains.lesson5.homework5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class IstihiTest {
    WebDriver driver;
    WebDriverWait webDriverWait;
    private final static String ISTIHI_BASE_URL = "https://istihi.ru/";

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupDriver() {
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get(ISTIHI_BASE_URL);
    }

    @Test
    void likeStihMayakovskyTest() throws InterruptedException {
        List<WebElement> authorlist = driver.findElements(By.xpath("//h3[@class = 'name']"));
        authorlist.stream().filter(f -> f.getText().contains("Маяковский Владимир")).findFirst().get().click();
        driver.findElement(By.xpath("//a[.='Встреча в Копенгагене']")).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='poem-btn add-like']")));
        driver.findElement(By.xpath("//div[@class='poem-btn add-like']")).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='poem-btn likes-added']")));
        driver.findElement(By.id("heart")).click();
        Assertions.assertEquals(driver.getCurrentUrl(), "https://istihi.ru/shelf");
        Assertions.assertEquals(driver.findElement(By.xpath("//a[.='Встреча в Копенгагене']")).getText(), "Встреча в Копенгагене" );
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
