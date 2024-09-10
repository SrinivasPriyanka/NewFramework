## Project Description:
- This Automation Framework is used to automate the web application using Selenium webdriver,java,TestNG and Maven.

## Prerequistes: 
- Java JDK version(17)
- Maven(3.1.2)
-  Apache poi(4.1.2)

## Technologies
- Java: Programming language for writing tests
- Selenium WebDriver: For browser automation
- TestNG: Managing test suites
- Maven: Build automation tool
- Extent reports: For test reporting

**Clone the repository**
git clone https://github.com/SrinivasPriyanka/NewFramework

**Execute the program:**
from command line : mvn test 

## Packages in the framework

- Base: In base class initialisation of driver,loading properties file and handling synchronization issues.
- Config package:Configurations like browser,user credintials.
- Resources:
    - globalPackage
    - staticPackage
 - Utilities: classes for storing evidences,reporting 
    - extent report will be genearted and stored in src/main/java/reports
    - evidences will be stored in C:/ScreenShot
