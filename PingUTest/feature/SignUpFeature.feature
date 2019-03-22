Feature: Resgistration functionality 


 Scenario Outline: Verify that the system only accepts valid FDM Email
    Given I open pingu sign up page  
    When I enter firstname '<f_name>', last name '<l_name>', username '<u_name>', password '<password>', confirm password '<password>', email '<email>', city '<city>', country '<country>', security answer '<answer>', linkedIn '<linkedin>' stream '<stream>'
    Then I should be able to register
    
    Examples: 
      | f_name | l_name | u_name  | password | email | city | country | answer  | linkedin | stream | 
      | wilson | li | wilsonli | p@ssw0rd | wilson.li@fdmgroup.com | Toronto | Canada | SG | www.linkedin/user.com | java developer | 
      | John | Doe | jdoe | p@ssw0rd | john.doe@hotmail.com | Toronto | Canada | SG | www.linkedin/user.com | java developer |
      
     
 
Scenario Outline: Verify that users provide unique username
      Given I neviagte to registration page
      When I enter firstname '<f_name>', last name '<l_name>', username '<u_name>', password '<password>', confirm password '<password>', email '<email>', city '<city>', country '<country>', security answer '<answer>', linkedIn '<linkedin>' stream '<stream>'
      Then I should not be able to register
      
      Examples: 
      | f_name | l_name | u_name  | password | email | city | country | answer  | linkedin | stream | 
      | wilson | li | wilsonli | p@ssw0rd | wilson.li@fdmgroup.com | Toronto | Canada | SG | www.linkedin/user.com | java developer |
      
     
      
      
