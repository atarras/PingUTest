#Author: your.email@your.domain.com
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Serch for other trainees/consultants functionality 

Background: Login 
  Given I open chrome browser
  And Launch PingU website
  And Log in to account 

  @tag1
  Scenario: Verify that I can search for groups
    Given I am on Home Page
    When I enter a group name to search box 
    And I select Group in the drop down 
    Then I successfully get the group  
    
  @tag2
  Scenario: Verify that user can search for other trainees/consultants 
    Given I am on Home Page
    When I click Group button 
    Then I should be able to the list of Groups available




