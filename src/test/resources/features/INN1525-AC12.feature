Feature: Default

	Background:
		#@INN-1493
		Given user is on the login page
		
	@INN-1525
	Scenario Outline: Verify user can login by using keyboard keys
		Verify user can login by using keyboard keys
		
		When user clicks on Username input box 
		And user writes valid "<username>" clicks Enter, writes valid "<password>" clicks Enter
		Then user lands on  "<intendedPage>"
		
		Examples: Driver, sales manager and store manager use different credentials and driver lands on Quick Launchpad, Sales/Store
		    Manager land on Dashboard
		
		      | username        | password    | intendedPage    |
		      | user13          | UserUser123 | Quick Launchpad |
		      | salesmanager103 | UserUser123 | Dashboard       |
		      | storemanager63  | UserUser123 | Dashboard       |