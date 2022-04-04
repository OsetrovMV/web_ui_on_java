package com.geekbrains.lesson6.homework6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationPractiseTest {
    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;

    @BeforeAll
    static void registerDriver() {

        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void intDriver () {

        driver = new ChromeDriver();
    }

    @Test
    void addToFavoritesTest() throws InterruptedException {
        driver.get("https://istihi.ru/");

        new MainPage(driver)
                .clickProfileButton()
                .login("igrok-17@mail.ru", "123456")
                .classicsBlockClick()
                .authorMayakovskijClick()
                .stihVstrechaVKopengageneClick()
                .likeStihClick()
                .favouritesClick();

        Assertions.assertEquals(driver.getCurrentUrl(), "https://istihi.ru/profile/shelf");
        Assertions.assertEquals(driver.findElement(By.xpath("//a[.='Встреча в Копенгагене']")).getText(), "Встреча в Копенгагене" );

        Thread.sleep(5000);
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

}
