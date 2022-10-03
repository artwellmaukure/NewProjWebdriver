Feature:OrangeHRM Login

  Scenario Outline:Login Verification on Orange HRM

    Given I launch the browser
    And I enter <username> and <password>
    When I login onto the HRM page
    And I verify Title of the page
    Then I close the browser

    Examples:
    |username|password|
    |admin   |admin|
    |manager    |demouserpwd|
    |user1      |demouserpwd|
    |user2      |demouserpwd|