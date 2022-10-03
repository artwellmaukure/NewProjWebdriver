Feature:GoogleLogin

  Scenario: Verification for Google Login
    Given I launch brwser
    When I Login into google page
    And I Verify Title Page
    Then I close browser