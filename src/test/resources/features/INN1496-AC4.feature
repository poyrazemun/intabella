Feature: Login to the app

	Background:User is on intabella login page
		Given user is on the login page
		
	@INN-1496
	Scenario Outline: Verify the leading and trailing spaces entered into the Username field are trimmed
		When user enters "<username>" with spaces before it and after it
		And user enters "<password>" in the password box
		Then user lands on  "<intendedPage>"
		
		Examples: Driver, sales manager and store manager use different credentials and driver lands on Quick Launchpad, Sales/Store
		    Manager land on Dashboard
		
		      | username        | password    | intendedPage    |
		      | user13          | UserUser123 | Quick Launchpad |
		      | salesmanager103 | UserUser123 | Dashboard       |
		      | storemanager63  | UserUser123 | Dashboard       |