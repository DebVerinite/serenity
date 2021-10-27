Feature: Logout to Orange HR
  User has to Logout to Web Portal

  Background: User is in the Logout Page
    Given User is in the Logout Page


  Scenario:  Login to the Application with Invalid UserName
    When User provides invalid Username john and Password admin
    Then Error message should appear with text "Invalid credentials"