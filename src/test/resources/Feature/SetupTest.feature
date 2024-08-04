Feature: This feature to setup framework

Scenario:  Validate top left corner logo
  # Given Open browser and navigate to retial app
  Then validate top left corner is TEKSCHOOL
  # Then Close the browser


Scenario: Validate Logo and Sign in button
  Then validate top left corner is TEKSCHOOL
  Then Validate sign in button is Enabled