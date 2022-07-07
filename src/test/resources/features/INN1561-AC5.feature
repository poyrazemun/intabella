Feature: Default

	Background:
		#@INN-1493
		Given user is on the login page
		


	@INN-1561
	Scenario: Verify all the fields in login page have proper placeholders
		Then user sees "Username or Email" placeholder in username input box
		Then user sees "Password" placeholder in the password input box