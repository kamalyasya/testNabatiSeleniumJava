Feature: User Login

	@smokeTest
  Scenario: Successful Login Using Number Phone
    Given I Navigate To The Tokopedia Website
    And I Click Button Masuk Login
    When I Enter Phone Number Or Email "081297189756"
    And I Click Button Login or Selanjutnya
    And I Click Verifikasi Login By SMS
    Then Verify Result Message Displayed After Login Number Phone And Close Modal PopUp
    
	@smokeTest
  Scenario: Successful Login Using Email
    Given I Navigate To The Tokopedia Website
    And I Click Button Masuk Login
    When I Enter Phone Number Or Email "molatesting16@gmail.com"
    And I Click Button Login or Selanjutnya
    When I Enter Password "12345678test"
    And I Click Button Login After Input Email & Password
    Then Verify Result Message Displayed After Login Email And Close Modal PopUp
    
	@smokeTest
  Scenario: Login Using Number Phone Result Failed
    Given I Navigate To The Tokopedia Website
    And I Click Button Masuk Login
    When I Enter Phone Number Or Email "081297189756"
    And I Click Locator Button Not Found
