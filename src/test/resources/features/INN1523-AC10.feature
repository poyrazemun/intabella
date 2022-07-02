Feature: Default

	Background:
		#@INN-1493
		Given user is on the login page
		


	@INN-1523
	Scenario: Verify user lands on ‘Forgot Password’ page after clicking on the "Forgot your password?" link
				and can change their password


		When user clicks Forgot your password? link
		And user lands on "Forgot Password" page
		And user types "username"
		|user13|
		|salesmanager103|
		And user clicks REQUEST button
		Then user changes his or her password