# Selenium Workshop

Small selenium workshop for ICESI's Software Engineering class  

## The challenge  

After the presentation about UI tests, E2E tests, POM, AAA and BDD, you have to create a UI test following the next specification:  

    Scenario: Open Facebook's Page
        Given a user logged in the application
        When he searches Universidad Ingeniería de Sistemas - Universidad Icesi
        And he posts a comment
        Then the post should be loaded
        When he cliok on send a direct message button
        Then he sent a message

You will have to use some of the following selectors  

    [data-testid=page-message-button]
    [data-testid=fanta_dropdown_menu_icon]
    [data-testid=fanta_dropdown_menu_open_full_conversation]
    [data-testid=info_panel] a
    [data-testid=composer_root] > div div[aria-autocomplete]
    [data-testid=info_panel] img
    
### To run the project
This project has included a maven wrapper. So, to run the test, just execute following command:

    mvnw.cmd test

For a linux based environment, execute:

    ./mvnw test

### Configuration

The base url for the project and the Web Driver to use can be configured by modifying the `src/test/resources/test.properties` file

* You will need to specify the path to the Chrome Web Driver using the `pathToChromeDriver` property. By default the path is the project root.
* You will need to set a facebook email and password valid

Note: you can download the chromedriver in https://chromedriver.chromium.org/downloads if you are getting troubles with the chromedriver that are in the root project. Remember that you should use the same chromedriver of your chrome version