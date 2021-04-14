package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        WebDriver obj =new FirefoxDriver();
        obj.get("https://www.yahoo.com");
    }
}
