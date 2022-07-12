Feature: Login to the app

	Background:
		#@INN-1493
		Given user is on the login page
		
	@INN-1498
	Scenario: Verify the copying of the text entered into the Password field is NOT POSSIBLE
		When user enter "<password>" in the password box
		And user tries to copy the text from password box
		Then user should not be able to paste the "<password>"