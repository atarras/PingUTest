Feature: Serching users/group functionality 

Background: Login 
  Given I open chrome browser
  And Launch PingU website
  And Log in to account 

  Scenario: Users can search for groups
    Given I am on Home Page
    When I enter TD bank to search box 
    And I select Group in the drop down 
    Then System should display TD Bank group  
    
  Scenario: User can search for other users
    Given I am on Home Page
    When I enter John Doe to the search box  
    Then System should display John Doe
   
  Scenario: User can send one to one message to a logged in user 
    Given I am on Home Page
    When I click on user message
    Then I should be able to send message to others 
   
   
   
