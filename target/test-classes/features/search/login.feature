Feature: login by keyword

  Scenario Outline: User is in the Login Page
    Given User is in the Login Page
    When User provides  Username and Password
    Then User should successfully login to the Web Portal
    Examples:User|user