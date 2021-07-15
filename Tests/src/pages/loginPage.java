package com.movies.loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeveloperPortalPage {
   private WebDriver driver;

   @FindBy(id = "username")
   private WebElement userName;

   @FindBy(id = "password")
   private WebElement password;

   @FindBy(id = "loginButton")
   private WebElement loginBtn;

   //Constructor
   public loginPage (WebDriver driver){
       this.driver=driver;

       PageFactory.initElements(driver, this);
   }

   
   public void login(){
       userName.sendKeys("abcd123");
       password.sendKeys("zyx321");
       loginBtn.click();
   }
}