package com.pages.addMoviePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeveloperPortalPage {
   private WebDriver driver;

   @FindBy(id = "title")
   private WebElement titleField;

   @FindBy(id = "releaseDate")
   private WebElement releaseDateField;

   @FindBy(id = "rating")
   private WebElement ratingsField;

   @FindBy(id = "addMovieBtn")
   private WebElement addMovieBtn;

   @FindBy(id = "message")
   private WebElement msg;



   //Constructor
   public addMoviePage (WebDriver driver){
       this.driver=driver;

       //Initialise Elements
       PageFactory.initElements(driver, this);
   }

   public void addMovieSuccess(string title, string date, int rating){
       title.sendKeys("The Departed");
       releaseDate.sendKeys("1/10/2020").formatDate("")
       rating.sendKeys(5)
        addMovieBtn.click();
   }    

   public String getMessage(){
       return msg.getText();
   }


}