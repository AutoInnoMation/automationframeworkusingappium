Feature: Search Flight

@SkyScanner
Scenario Outline: Search Flight
  Given I launch the application
  When I am in the "Explore" screen
  Then I tap on "Flights"
  Then I enter departing from "<Departure>"
  And I enter flying to "<Arrival>"

Examples:
  | Departure | Arrivals |
  | DBX       | JFK      |
