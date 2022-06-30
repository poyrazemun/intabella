Feature: Login to the app

	Background:
		#@INN-1493
		Given user is on the login page
		

	
	@INN-1497
	Scenario: Verify the Password text entered into the "Password" field is toogled to hide its visibility
		When user enters "<password>" in the password box
		Then the visibility of password text should be invisible