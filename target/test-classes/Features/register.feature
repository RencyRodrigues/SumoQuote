@Register
Feature: To test register functionality on Lowblaws website


@SuccessfulRegister
Scenario Outline: To test successful Register
Given User launches Loblaws url
When User clicks on Sign In page
Then User Clicks on Create PC id
Then User creates an account by providing enter "<Email>","<Password>" and "<confirmPassword>"
Then user clicks on Agree checkbox
Then user clicks creates PC id button

Examples:
|Email|Password|confirmPassword|
|John_Singh01@gmail.com|FirstTest@001|FirstTest@001|
#|John_Singh02@gmail.com|FirstTest@002|FirstTest@002|
