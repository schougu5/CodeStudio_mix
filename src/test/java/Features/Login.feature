Feature: Login Validation

//Adding this line as bugfix in NewBR_SC branch.I created this new branch for my task. It was assigned by Lead

  Scenario: User is able to login with valid credentials
  Given User navigates to the Login page
    When User enters valid email and password
    And User clicks on the login button
    Then User should be redirected to the Dashboard page
    And Page title should be "Dashboard / nopCommerce administration"