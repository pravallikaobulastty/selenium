Feature: Testing Swaglabs login page
Scenario: verify login button fuctionality with username and password as blank
Given user must be on login page
When user click on login button
Then verify error msg must be "Epic sadface: Username is required"
And cross button at error msg label must be visible 
