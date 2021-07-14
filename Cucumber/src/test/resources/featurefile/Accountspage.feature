Feature: This feature is to test account page feature


Background: 
Given User has already logged in to application
|username|password|
|sangeethkumarasp@gmail.com|sangeeee|




Scenario: Account page title
Given user is on the account page
When user gets the title of the page
Then page title should be "My account - My Store"


Scenario: Account section count 
Given user is on the account page
Then user gets account section page
|ORDER HISTORY AND DETAILS|
|MY CREDIT SLIPS|
|MY ADDRESSES|
|MY PERSONAL INFORMATION|
|MY WISHLISTS|
And account sections count should be 5