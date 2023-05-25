Feature: Login Gmail

  @SmokeTest
  Scenario: Login Gmail with correct password
    Given Pablo go to the gmail page
    When he enter email "xxx@gmail.com" and password "xxx"
    Then can see received messages