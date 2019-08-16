# Selenium Workshop

Small selenium workshop for ICESI's Software Engineering class

### To run the project
This project has included a maven wrapper. So, to run the test, just execute following command:

    mvnw.cmd test

For a linux based environment, execute:

    ./mvnw test

### Configuration

The base url for the project and the Web Driver to use can be configured by modifying the `src/test/resources/test.properties` file

* You will need to specify the path to the Chrome Web Driver using the `pathToChromeDriver` property  
* You will need to set a facebook email and password valid