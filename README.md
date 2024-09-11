# Automation Testing Practice for SauceDemo Website

This Practice contains automated test scripts for the SauceDemo website. The tests are written in Java using the Selenium framework. The practice follows the Page Object Model (POM) design pattern and uses TestNG for test execution and assertions.

## Tools Used
- Selenium WebDriver: Web automation library for interacting with web elements.
- TestNG: Testing framework for organizing and executing tests.
- Page Object Model (POM): Design pattern for maintaining test scripts and page objects separately.
- Assertions: Used to validate expected outcomes of test executions.

## Test Cases

### CompleteCheckout
Verify that a user can complete the checkout process on the SauceDemo website.
- Steps:
  1. Login with valid credentials.
  2. click on Sortby button.
  3. Choose Sortby price (low to high).
  4. From the first product (with least price) click add to cart button.
  5. click on shopping cart logo.
  6. Proceed to the checkout page.
  7. Fill in the shipping details.
  8. Click on the Finish button to place order.
