Feature: Serching users/group functionality 

Scenario: Login 
  Given I open chrome browser, login to pingu account 

  Scenario: Verify that users can search for groups
    Given I am on Home Page
    When I enter TD bank to search box 
    And I select Group in the drop down 
    Then System should display TD Bank group  
    
  Scenario: Verify that user can search for other users
    Given I am on Home Page
    When I enter John Doe to the search box  
    Then System should display John Doe
   
  Scenario: Verify that user can send one to one message to a logged in user 
    Given I am on Home Page
    When I click on user message
    Then I should be able to send message to others 
   
   
   
