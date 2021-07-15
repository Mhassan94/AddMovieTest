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

   @Test
   public void verifyAllElementDisplay() {
       Assert.assertTrue(title.isDisplayed());
       Assert.assertTrue(releaseDate.isDisplayed());
       Assert.assertTrue(title.ratings());
   }

   @Test
   public void verifyAddingMovie() {
       addMovieSuccess();
       msg = getMessage();
       Assert.assertEqual("Successfully Added Movie", msg);
   }



    @After
    public void close(){
          driver.close();
       }
   }