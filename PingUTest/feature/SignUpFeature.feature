Feature: Registration functionality 

Scenario: users successfully register with valid FDM Email
    Given I open pingu sign up page  
    When I enter jd@fdmgroup.com to email field
    Then I should successfully register
    
Scenario: users fails to register with non FDM Email
    Given I open pingu sign up page  
    When I enter jd@test.com to email field
    Then I cannot register 
      
Scenario: users cannot register with already used username
      Given I open pingu sign up page
      When I enter jdoe to username field
      Then I cannot register

      
     
      
      
