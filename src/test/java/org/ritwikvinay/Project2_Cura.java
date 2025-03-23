package org.ritwikvinay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Project2_Cura {
    @Test
    public void test_verify_URl () {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");
        WebElement makeAppointment = driver.findElement(By.id("btn-make-appointment"));
        makeAppointment.click();
        WebElement login_user = driver.findElement(By.id("txt-username"));
        login_user.sendKeys("John Doe");
        WebElement login_pwd= driver.findElement(By.name("password"));
        login_pwd.sendKeys("ThisIsNotAPassword");
        WebElement login_btn =driver.findElement(By.id("btn-login"));
        login_btn.click();
        String currURL= driver.getCurrentUrl();
        System.out.println(currURL);
        Assert.assertEquals(currURL, "https://katalon-demo-cura.herokuapp.com/#appointment");
        driver.quit();

    }

}
