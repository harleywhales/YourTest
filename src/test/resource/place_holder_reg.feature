Feature: As a user
I want to be able to see the place holder on the registration page

Background: See landing page
Given I launch the "url"
Then I see the "Login" page displayed

Scenario: Confirm place holder is displayed
Given I click "register" button
When I confirm "Email Address" text_field has a place holder of "Enter email"
And I confirm "username" text_field has a place holder of "Enter username"
Then I confirm "password" text_field has a place holder of "Enter password"
And I confirm "Confirm password" text_field has a place holder of "Confirm password"