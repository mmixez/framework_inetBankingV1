
package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


        WebDriver driver;

        LoginPage(WebDriver driver){
           this.driver = driver;
           PageFactory.initElements(driver,this);

        }

        @FindBy(name="uid")
        @CacheLookup
        WebElement txtUserName;

        @FindBy(name="password")
        @CacheLookup
        WebElement txtPassword;

        @FindBy(name="btnLogin")
        @CacheLookup
        WebElement btnLogin;

        public void setUserName(String uname) {
            txtUserName.sendKeys(uname);
        }

        public void setTxtPassword (String pwd) {
            txtPassword.sendKeys(pwd);
        }

        public void clickSubmit() {
            btnLogin.click();
        }

    }

