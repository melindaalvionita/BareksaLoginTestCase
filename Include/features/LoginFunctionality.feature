Feature: Login functionality
  As a user
  I want to be able to log in to Bareksa App
  
 Background:
  	Given User navigates to login page
    
  Scenario Outline: Login with valid credentials

    When User enters a valid <email> and a valid <password>
    And Click on login button
    Then User should be logged in successfully and navigated to OTP page

		Examples:
			| email 							      | password 							 |
			| melindalvionita27@gmail.com | Qwertyuiop1! |
			
	Scenario Outline: Login with invalid email and invalid password

    When User enters invalid <email> and invalid <password>
    And Click on login button
    Then User should see an error message Email atau Password salah

		Examples:
			| email										| password |
			| melindalvionita27@gmail.com | 123qwe |

  Scenario Outline: Login with invalid format email and valid password
 
    When User enters invalid format <email> and valid <password>
    And Click on login button
    Then User should see an error message Format email salah

		Examples:
			| email 										| password |
			| melindalvionita27@gmail | Qwertyuiop1! |
			
	Scenario: Login with blank email and password

    When User leaves the <email> blank and <password> blank
    And Click on login button
    Then User should see an error message wajib diisi below Email and Password field

  Scenario: Forgot password functionality

    When User click on the Lupa Password Button
    Then User should be redirected to the password recovery page


	