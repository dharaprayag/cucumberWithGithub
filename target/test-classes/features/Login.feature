Feature: Login into Application

Scenario Outline: Positive test validating login
Given Initialize the browser with chrome
And Navigate to "https://www.rahulshettyacademy.com/#/index" Site
And Click on Login link in home page to land on secure sigin in page
And User enters <username> and <password> and logs in
Then Verify that user is successfully logged in
Then Close the Browsers

Examples:
|username					|password			|
|dharapatel80085@gmail.com	|dharapatel80085	|
#correct Password is dharapatel80085@
|test99@gmail.com			|123456				|







#Feature: Application Login
#
#Scenario: Home page default login
#Given User is on NetBanking landing page
#When User login into application with "jin" and "1234"
#Then Home page is populated
#And Cards displayed are "true"
#
#Scenario: Home page default login
#Given User is on NetBanking landing page
#When User login into application with "john" and "4321"
#Then Home page is populated
#And Cards displayed are "false"