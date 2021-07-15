The view.html is the add movie page src code. 

The automation Test were created using a Page Object Model. I created the pages (i.e. addmoviepage, loginPage, etc.) with all the required webelements, and methods needed to create functional automation tests. The tests are seperated so that each page has a testing suite. For example, addMoviePage is associated with testAddMovie. There are some pre-requisites for the pages, so for the addMovie pages it is dependent on Login Page. So I imported loginPage webelements and method in the testAddmovie suite. 

As for data, there is another folder under src. And the data will be pulled from several data files if necessary. 

In the Testing suite testAddMovie I have added several test cases that will run to show how they would work and to show the organization of each test. The following are the tests I would run for the addMovie page:

    Positive Tests:
      1.) Verify Add Movie Successfully
      2.) Verify Add movie button is enabled when All three fields are filled
      3.) Verify Letters and Numbers can be added in title field
      4.) Verify Correct Number of characters in title field
      5.) Verify date can be inputted in date field
      6.) Verify adding correct date input
      7.) Verify ratings can be inputed in ratings field
      8.) Verify inputting correct rating (1 -5)
      9.) Verify on initial load of page add movie button is not enabled
      
    Negative Tests:
      1.) Verify adding more than 200 characters in the title box 
      2.) Verifiy inputting incorrect date data 
      3.) Verify inputting incorrect date format (i.e. 01201994, March 5, 2017)
      4.) Verify inputting date below the accepted ranged (accepted range is 1/10/2015)
      5.) Verify inputting rating below 0 and above 5
      6.) Verify inputting Letters or invalid character in ratings box.
      7.) Verify invalid field data doe not get Add Movie Button Enabled
      
    Sanity Tests:
      1.) Verify Add movie Page Loads
      1.) Verify Field Labels are Correct
      2.) Verify Page Title
      3.) Verify Input field are enabled
      4.) Verify Add Movie button is displayed
      
      

