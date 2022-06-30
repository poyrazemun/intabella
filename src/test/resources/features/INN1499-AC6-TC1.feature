Feature: Login to the app

  Background:

    Given user is on the login page


  @INN-1499
  Scenario Outline: Verify user gets the required WARNING MESSAGE for invalid credentials
    When user enters "<invalidUsername>" or "<invalidPassword>"
    And user clicks login button
    Then user should see "Invalid user name or password." message

    Examples: Wrong credentials

      | invalidUsername      | invalidPassword |
      | user133432           | UserMUser123    |
      | salesmanager10352368 | MUserUser123    |
      | shopmanager63        | UserUser1234569 |