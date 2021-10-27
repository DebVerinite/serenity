Feature: Login to Orange HRM
  In Order To Access Orange HRM Portal
  User has to login to Web Portal

  Background: User is in the Login Page
    Given User is in the Login Page

  Scenario:  Login to the Application Successfully
    When User provides valid Username admin and Password admin
    Then User should landing to Dashboard Page