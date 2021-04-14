package com.company.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/Bryan/IdeaProjects/Test_Selenium_Project/drivers/chromedriver.exe");
        WebDriver  driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        String tittle= driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.println(url+" "+tittle);
        driver.quit();
    }
}
