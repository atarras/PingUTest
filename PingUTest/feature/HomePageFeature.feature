Feature: Serch for other trainees/consultants functionality 

Background: User can load the website
    Given User launches web browser
    And User enters the web homepage url in browser

  Scenario: Verify that I can search for groups
    Given I am on Home Page
    When I enter a group name to search box 
    And I select Group in the drop down 
    Then I successfully get the group  
 
  Scenario: Verify that user can search for other trainees/consultants 
    Given I am on Home Page
    When I click Group button 
    Then I should be able to the list of Groups available




