Feature:Login page feature

@Sanity
Scenario:Login page title
Given user is on the login page
When user gets the title of the page
Then page title should be "Login - My Store"

@Sanity
Scenario:Forgot password link
Given user is on the login page
Then forgot your password link to be Displayed

@Sanity
Scenario:Login with correct credentials
Given user is on the login page
When user enters username "sangeethkumarasp@gmail.com"
And user enters password "sangeeee"
And user clicks on Login button
When user gets the title of the page
Then page title should be "My account - My Store"

