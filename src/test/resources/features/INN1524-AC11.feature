Feature: Default

	    Background:
		Given user is on the login page
		


	@INN-1524
	Scenario: Verify user can see the "Remember me on this computer" checkbox on the login page and it should be clickable
		When user sees the Remember me on this computer checkbox
		Then user should be able to click on it