Feature: Home Page features verifications

  Scenario: Verify whether user can search for an item from home page
    Given I want to launch application "https://www.amazon.com/" on "chrome" browser
    And I want to search for "camera" under "Amazon Devices" department
