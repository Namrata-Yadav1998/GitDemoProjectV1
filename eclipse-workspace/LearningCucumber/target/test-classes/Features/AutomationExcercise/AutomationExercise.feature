Feature: Automation Exercise page practice

  #Scenario: Signup to Automation Exercise
  #Given User is on automation exercise Browser
  #When User click on Sign up
  #Then Navigate to Sign Up Page
  #When User Enters Name and Email Address
  #And User Naviagtes to New User Signup!
  #And Select Title Raido,Select name,Enter Email, Enter Password, Selct Date of Birth and Sign of our news letter
  #And Enter Address Info First name, Last Name, Address, Country, State,City, Zipcode,Mobile Number
  #Then Click Create Account
  #And New User Signup! page apprear
  #@AELogin
  #Scenario: Login to Automation Exercise
    #Given User is on automation exercise Browser
    #When User click on LoginButton
    #Then Navigate to Login to your account
    #When User Enters Email Address and Password
    #And Click on Login Page
    #Then Navigate to Automation Exercise Home Page
    #When Click on Add to cart
    #And Click on View Cart
    #Then Click on Proceed to checkOut
     #

    #Examples: 
      #| Email|               | Pass |
      #| namo123@yopmail.com| | 1234 |
      
      
  Scenario: User is able to Contact Us
  
  Given User is on automation exercise Browser
  When User is Click on Contact Us 
  Then User navigate to Contact Us Screen
  When Enter Name Email Subject 
  And Choose File
  Then Click Submit 
  And Click OK Alert Pop up
  And Success! Your details have been submitted successfully.
  And Click on Home 
