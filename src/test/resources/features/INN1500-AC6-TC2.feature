Feature: Default

	Background:

		Given user is on the login page
		


	@INN-1500
	Scenario: Verify user gets the required WARNING MESSAGE for any empty field 
		When user clicks login button without providing any credentials
		Then user must see "Please fill out this field." message