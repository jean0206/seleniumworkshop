Feature: Facebook Testing

  Scenario: Open Facebook's Page
    Given a user logged in the application
    When he searches Universidad Ingeniería de Sistemas - Universidad Icesi
    Then the page title should say Facebook - Log In or Sign Up