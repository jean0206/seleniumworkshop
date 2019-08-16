Feature: Facebook Testing

  Scenario: Open Facebook's Page
    Given a user logged in the application
    When he searches Universidad Ingeniería de Sistemas - Universidad Icesi
    And he posts a comment
    Then the post should be loaded
