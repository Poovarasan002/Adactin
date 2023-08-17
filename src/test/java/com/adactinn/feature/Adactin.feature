Feature: Application For Hotel Booking In Adactin


@Smoketest
Scenario: User Login In The Web Application
Given user Launch The Adactin Application
When user Enter The Username In Username Field
And user Enter The Password In Password Field
Then user Click The Login Button And It's Navigates To Serach Hotel Page

@search
Scenario: User Search The Hotel
When user Select The Location In Location Field
And user Select The Hotel In Hotels Field
And user Select The Room_Type In Room_Type Field
And user Select The Number Of Rooms In Number Of Rooms Field
And user Enter The Date In Check In Date Field
And user Enter The Date In Check Out Date Field
And user Select The Adults Per Room In Adults Per Room Field
And user Select The Children per Room in Children Per Room Field
Then user Click The Search Button And It's Navigates to Select Hotel page

@select
Scenario: User Select The Hotel
When user Click The Hotel
Then user Click The Continue Button And It's Navigates To Book A Hotel Page

@book
Scenario: Book A Hotel
When user Enter The First Name In First Name Field
And user Enter The Last Name In Last Name Field
And user Enter The Billing Address In Billing Address Field
And user Enter The Credit Card Number In Credit Card No Field
And user Select The Credit Card Type
And user Select The Month In Expiry Date Field
And user Select The Year In Expiry Date Field
And user Enter The CVV Number In CVV Number Field
Then user Click The Book Now And It's Navigates To Booking Confirmation Page

@logout
Scenario: user Logout In The Web Application
When User Click The Logout Button To Logout The Session