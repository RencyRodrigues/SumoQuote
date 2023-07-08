@LoblawsWebsite @runEntireTestcase @test1
Feature: Test Login Functionality

Background: 
Given: User enters loblaws url
When: Internet is up and running

  @valid_username @valid_password @test1
  Scenario: Check login is successful with valid email and password
    
    Given: User enters Loblaws Url in the browser
    And: opens the Loblaws website
    When: user enters valid email and valid password
    And: Clicks on Sign_in button
    Then: user is able to successfully login into website
    And: Navigated to home page
    
@test1
     Scenario Outline: Check login is successfull with valid inputs
    Given: User enters Loblaws Url in the browser
      And: Opens the Loblaws website
      When: user enters <Email> and <Password>
      And: clicks on sign_in button
       Then: user is able to successfully login into website
      And: Navigated to home page
      
    
    Examples:
    |Email|Password|
    |abc@gmail.com|abc123|
    |xyz12@gmail.com|zyxrt23|
