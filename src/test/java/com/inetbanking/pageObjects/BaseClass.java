package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
    public String baseURL = "https://demo.guru99.com/v4/";
    public String username = "mngr582962";
    public String password = "tagUtUn";
    public static WebDriver driver;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver");
        driver= new ChromeDriver();
    }



    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
