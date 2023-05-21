Feature: To validate the account creation of facebook page
Scenario: To create a new account
Given To launch the browser and maximize the window
When To launch the url of facebook
When To click the create new account button
When To pass the first name in the first textbox
#one dimensional map
#keys  |@values
|firstname|maheswari|
|firstname2|karuppusamy|
|firstname3|saikaish|
When To pass the second name in the second textbox
When To pass the mobile number and email in email textbox
When To pass the password in the password textbox
#Two dimensional map
|password|password1|
|1234556|@#$%^%&^|
|abjsfajkfhasjkb|!jhfjds#$|
|ndhijkhsdk|...djshd|
Then To close the browser

