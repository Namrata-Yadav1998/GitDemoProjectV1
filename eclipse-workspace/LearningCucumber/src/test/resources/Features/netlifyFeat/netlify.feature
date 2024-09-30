Feature: Test each module of try testing this netlify app

Scenario: Enter all fields in This is your sample Form

Given  Open netify browser
And User is on This is your sample Form Page
When Enter First Name and Last Name
And Select Gender
And Choose and Option
#And select multiple options
And Choose applicable options
And Start typing and it till automatically guess answer
And Select a Date from Date Picker
And Enter Long Message
Then Click on Submit
