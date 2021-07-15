package com.src.tests;

import com.pages.addMoviePage; //Importing addmoviepage object model
package com.pages.loginpage; //Importing Login Page object Model
package com.pages.listViewPage; //Importing List 

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ApplyAsDeveloperTest {
   WebDriver driver;

   @Before
   public void setup(){
       //use FF Driver
       driver = new FirefoxDriver();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       login();
   }

   // SANITY TESTS

   @Test
   public void verifyAllElementDisplay() {
       Assert.assertTrue(title.isDisplayed());
       Assert.assertTrue(releaseDate.isDisplayed());
       Assert.assertTrue(title.ratings());
   }

   //POSITIVE TESTS

   @Test
   public void verifyAddingMovie() {
       addMovieSuccess();
       msg = getMessage();
       Assert.assertEqual("Successfully Added Movie", msg);
   }

   @Test
   public void missingField(){
       title.sendKeys("Nightmare on Elmstreet");
       //Missing release Date
       rating.sendKeys("4");
       addMovieBtn.click()
       msg = getMessage();
       Assert.assertEqual("All Fields Must Be Field In", msg);
   }

   // NEGATIVE TESTS

   @Test
   public void titleWithMoreThanMaxChars() {
       title.sendKeys(""); //Send more than 200 keys
       addMovieBtn.clcik();
       msg = getMessage();
       Assert.assertEqual("Cannot Accept more than 200 Characters", msg);
   }

   public void dateBelowRequiredDate() {
       releaseDate.sendKeys("1/10/2014"); //one year less than required date
       addMovieBtn.clcik();
       msg = getMessage();
       Assert.assertEqual("Date Must Be Above 1/10/2015", msg);
   }

   public void invalidRating() {
       rating.sendKeys("7"); //Must Be between 1-5
       addMovieBtn.clcik();
       msg = getMessage();
       Assert.assertEqual("Invalid Rating Number", msg);
   }


    @After
    public void close(){
          driver.close();
       }
   }