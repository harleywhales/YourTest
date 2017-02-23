Feature: As a user 
I want to register

Background: Seelanding page
Given I launch the "url"
Then I see the "login" page displayed

Scenario: Register
Given I click "register" button
And I entered "Email address" as "harleywhales01@gmail.com" in the text field
When I entered "Preffered username" as "whales_01" in the text field
And I entered "Password" as "harley" in the text field
Then I entered "confirm password" as "harley" in the text field
And I click "register_on_form" button
And I see the "login" page displayed
