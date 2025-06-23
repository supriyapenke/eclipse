@tag
Feature: Check the application before login
 
 
  @Beforechecks
  Scenario Outline: Check password credential
    Given User has provided application URL
    Then  check the homepage title
    When  Home page title validated and enter "<username>"
    And   Enter "<password>"
    When  After username and password hit enter
    Then  Check the login title
    
    Examples: 
      | username                | password    |
      | standard_user           | secret_sauce|
     #| locked_out_user         | secret_sauce|
      #| problem_user            | secret_sauce|
      #| performance_glitch_user | secret_sauce|
      #| error_user              | secret_sauce|
      #| visual_user             | secret_sauce|
      #| secret_sauce            | secret_sauce|
      #| standard_user           | invalid     |
      #|                         |             |
    
    
@afterlogin
  Scenario: Check add to cart
    Given URL is login with valid credentials
    Then  Click on add to cart
    And   Value is added into cart
    And   Click on cart symnol
    Then  Check product page
    When  Continue to checkout
    Then  Check the title
  