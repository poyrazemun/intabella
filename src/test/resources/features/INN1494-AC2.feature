Feature: Login without valid credentials
	Background: User is on intabella login page
		Given user is on the login page

	@INN-1494 @wip
	Scenario Outline: Verify the system shouldn't allow users to access the application without providing credentials
		Verify the system shouldn't allow users to access the application without providing credentials
		
		    When user enters "<username>" in the username box
		    And user enters "<password>" in the password box
		    Then user lands on  "<intendedPage>"
		    And user copies the URL
		    Then user log out
		    Then user paste the URL to the browser
		    Then user clicks login button without providing credentials
		    And user can not land on "<intendedPage>"
		
		    Examples: Driver, sales manager and store manager use different credentials and driver lands on Quick Launchpad, Sales/Store
		    Manager land on Dashboard
		
		      | username        | password    | intendedPage    |
		      | user13          | UserUser123 | Quick Launchpad |
		      | salesmanager103 | UserUser123 | Dashboard       |
		      | storemanager63  | UserUser123 | Dashboard       |