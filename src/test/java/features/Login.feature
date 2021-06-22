Feature: Login into Application

Scenario: Positive test validating login
Given Initialize the browser with chrome
And Navigate to "https://www.rahulshettyacademy.com/#/index" Site
And Click on Login link in home page to land on secure sigin in page
And User enters "dharapatel80085@gmail.com" and "dharapatel80085@" and logs in
Then Verify that user is successfully logged in







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