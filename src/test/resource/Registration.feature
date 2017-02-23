Feature: As a user
I want to be able to register

Background: See landing page
Given I launch the "url"
Then I see the "login" page displayed

Scenario: Register
Given I click "register" button
And I enter "Email address"
When I enter "Preffered_username"
And I enter "password"
Then I enter "Confirm Password"
And I click "register_on_the_form" button

