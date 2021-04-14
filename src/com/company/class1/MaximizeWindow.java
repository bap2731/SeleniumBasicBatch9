package com.company.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/Bryan/IdeaProjects/Test_Selenium_Project/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.navigate().to("http://www.facebook.com/");
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();
        driver.navigate().back();

    }
}
