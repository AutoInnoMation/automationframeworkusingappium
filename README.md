**How to create test automation framework from scratch using appium, testNG, cucumber.**
Tools & Technologies :
1. Java
2. Appium
3. TestNG
4. Cucumber
5. Maven
6. Extent
7. IntelliJ

**What is a test automation framework ?**

A test automation framework is essentially a set of guidelines for creating and designing test cases. It is a conceptual part of automated testing that helps testers to use and maintain resources more efficiently.

**To get app package and activity name use below command:**

adb shell "dumpsys window windows | grep -i 'mCurrentFocus'"

**Steps to create Test automation Framework using Appium, Cucumber, TestNG :**
1. Install plugins – TestNG and Cucumber
2. Create an maven project – As we are going use maven as build tool
3. Add dependency in POM.xml 
4. Create resource folder under test 
5. Add package structure under test/java –
6. Create a feature and writing test scenarios following the BDD rules
7. Identify appPackage and appActivity details 
8. Write DriverFactory – Initialize Driver
9. Write TestNGRunner file 
10. Run the feature file to generate steps definitions
11. Use step definitions
12. Identify objects
13. Create PageObject class following Page Object Model
14. Create Utility class to interact with device
15. Write automation code in Page class
16. Integrate the page class and step definitions
17. Run the code
18. Add reporting – Extent Report
19. Configure POM.xml to run from command prompt. And codebase can to integrate with CI/CD
20. See the Report





