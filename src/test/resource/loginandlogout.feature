Feature: As a user, I want to be 
able to login and logout.

Background: See landing page
Given I launch the "url"
Then I see the "Login" page displayed


Scenario Outline: Login 
Given am on the "Login" page
And I enter my "Username" as "<Username_Details>"
And I enter my "Password" as "<Password_Details>"
When I click "Login" button
Then I see the "Home" page displayed


Examples: Login data
| Username_Details   | Password_Details |
| montego01          | 12345678         |
| SuperMum01         | 12345678         |
| wegit              | 12345678         |
| montego01          | 12345678         |
| SuperMum01         | 12345678         |
| wegit              | 12345678         |

Scenario: Logout
Given am on the "Home" page
When I click "Logout" link
Then I see the "Home" page displayed