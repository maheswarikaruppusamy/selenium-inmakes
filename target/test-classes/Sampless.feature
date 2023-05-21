@feature1
Feature:  To validate the functionality of login page of facebook.
@sanity
Scenario: To validate login page with valid user name and valid password.
Given To launch the browser and maximise the window.
When To lanch the url of the facebook.
And To pass the valid username and valid password.
And To click the login button.
And To check whether page is navigate to home page or not.
And  To close the entire browser.
@smoke
Scenario Outline: To validate the postive and negative combination of login functionality
Given user should launch the browser and maximise the window
When user should hit the url of the facebook
And user should pass the valid data"<Emaildatas>" in email feild
And user should pass the invalid data "<Passworddatas>"in password feild
And User should click the login button
And   user should close the entire browser


Examples:
|Emaildatas         |Passworddatas|
|inmakes@gmail.com  |inmakes      |
|maheswari@gmail.com|maheswari    |
|java@gmail.com     |123456       |
|datadriven@gmail.com|erenceaa    |
