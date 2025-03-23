package org.ritwikvinay;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Project_test_google {
    @Test
    public void get_web() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");  // Makes Selenium undetectable
        options.addArguments("--disable-popup-blocking"); // Prevents popups
        options.addArguments("--disable-notifications");  // Disables any notifications

        // Set up WebDriver
        WebDriver driver = new ChromeDriver(options);

        // Open Google
        driver.get("https://www.google.co.in");

        // Locate and click on the search box
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("ATB");
        searchBox.click();
        searchBox.sendKeys(Keys.ENTER);
        Thread.sleep(5000);

        // Close browser
        driver.quit();
    }
}

