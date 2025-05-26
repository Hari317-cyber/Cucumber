Feature: Web Login

  @Login1
  Scenario: Validate invalid credentials
    Given Navigate to url
    When Verify that home page is visible successfully
    And Enter incorrect email address and password1
    Then Click 'login' button
    And Verify error 'Your email or password is incorrect!' is visible

  @Login2
  Scenario: Validate credentials
    Given the user is in login page
    When the user enters valid credentials
    And clicks submit button
    Then user logged in successfully
    And logout


