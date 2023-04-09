@Create-Account
Feature: Create Account Feature
        In order to Create Account on Cars.com page
        As a user Enter correct email, FirstName,LastName and Password

  @Create-Account-tag
  Scenario: Create a new Account on Cars.com Page
    Given user navigate to "https://www.cars.com/" website
    When user Click Menu section
    Then user Click "Create Account" link
    Then user enter email "vigneshgovindaraju2000@gmail.com" and click next
    Then user enter firstName "Vignesh" and lastName "G " and password "abc@123"
