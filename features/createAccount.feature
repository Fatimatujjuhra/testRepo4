@sampleFeature
Feature: Making a new account in Amazon

As a new user of Amazon
I want to enter my email address, give my password and click on sign in option
So that I can create my Amazon account

@sampleFeatureScenario1
Scenario: Making a new account successfully for shopping easily

Given I need to have an email id and a password
When I enter my valid email id, and enter my valid password, and I confirm it
Then I receive a confirmation email that the account has been created

@sampleFeatureScenario2
Scenario: Making a new account become unsuccessful

Given I need to have an email id and a password
When I enter my invalid email id, and enter my invalid password, and I confirm it
Then I am expecting an error message saying that ‘There was a problem; we cannot find an account with that email address