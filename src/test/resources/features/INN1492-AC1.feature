Feature: Login to the app

  Background: User is on intabella login page
    Given user is on the login page


  @INN-1492 @wip
  Scenario Outline: Verify user can login with valid credentials and "DRIVER" land on the "Quick Launchpad". "SALES MANAGER/STORE MANAGER" land on the "Dashboard"
  Verify user can login with valid credentials and "DRIVER" land on the "Quick Launchpad".
  "SALES MANAGER/STORE MANAGER" land on the "Dashboard"

    When user enters "<username>" in the username box
    And user enters "<password>" in the password box
    Then user lands on  "<intendedPage>"

    Examples: Driver, sales manager and store manager use different credentials and driver lands on Quick Launchpad, Sales/Store
    Manager land on Dashboard

      | username        | password    | intendedPage    |
      | user13          | UserUser123 | Quick Launchpad |
      | salesmanager103 | UserUser123 | Dashboard       |
      | storemanager63  | UserUser123 | Dashboard       |