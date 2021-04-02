#Autor : Ebru

  Feature: DarkSky HomePage

    Scenario: Location Weather
    Given User in of the DarkSky Page
    When User clears the location box
    And User searches their location in the search box
    And User clicks to search
    Then Lowest and highest temperature is displayed