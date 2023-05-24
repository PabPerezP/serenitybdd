Feature: Login Gmail

  @SmokeTest
  Scenario: Login Gmail with correct password
    Given Pablo go to the gmail page
    When he enter email "perezpadillapabloandres@gmail.com" and password "ycvviweixgafwesd*"
    Then can see received messages