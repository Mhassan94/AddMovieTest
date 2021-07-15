package com.pages.listViewPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeveloperPortalPage {
   private WebDriver driver;

   @FindBy(id = "movieList")
   private WebElement movieList;





   //Constructor
   public listViewPage (WebDriver driver){
       this.driver=driver;

       //Initialise Elements
       PageFactory.initElements(driver, this);
   }

   public void getList(){
       movielist.get();
   }


}