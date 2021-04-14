package com.company.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/Bryan/IdeaProjects/Test_Selenium_Project/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();// launch the browser
        driver.get("https://www.facebook.com/");//navigate to the specified url
        driver.navigate().to("https://www.google.com/");//getting current url
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.navigate().refresh();
        //driver.quit();
        driver.close();


    }

}
