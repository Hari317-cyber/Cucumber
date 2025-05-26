Feature: Search Products
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Click on 'Products' button
##  5. Verify user is navigated to ALL PRODUCTS page successfully
#  6. Enter product name in search input and click search button
#  7. Verify 'SEARCHED PRODUCTS' is visible
#  8. Verify all the products related to search are visible

  @Search1
  Scenario: Validate search a product
    Given the user is in login page
    When the user enters valid credentials
    And clicks submit button
    Then user logged in successfully
    And Click on 'Products' button
    And Verify user is navigated to 'ALL PRODUCTS' page successfully
    And Enter product name 'Blue Top' in search input and click search button
    Then Verify 'Blue Top' is visible
    And logout


#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Add products to cart
#  5. Click 'Cart' button
#  6. Verify that cart page is displayed
#  7. Click 'X' button corresponding to particular product
#  8. Verify that product is removed from the cart

  @Search2
  Scenario: Validate add and remove products
    Given the user is in login page
    When the user enters valid credentials
    And clicks submit button
    Then user logged in successfully
    And Click on 'Products' button
    And Verify user is navigated to 'ALL PRODUCTS' page successfully
    And Enter product name 'Blue Top' in search input and click search button
    Then Verify 'Blue Top' is visible
    And Add products to cart
    Then Click Cart button
    And Verify that cart page is displayed
    And Click 'X' button corresponding to particular product
    And logout

#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Click 'Signup / Login' button
#  5. Fill all details in Signup and create account
#  6. Verify 'ACCOUNT CREATED!' and click 'Continue' button
#  7. Verify ' Logged in as username' at top
#  8. Add products to cart
#  9. Click 'Cart' button
#  10. Verify that cart page is displayed
#  11. Click Proceed To Checkout
#  12. Verify that the delivery address is same address filled at the time registration of account
#  13. Verify that the billing address is same address filled at the time registration of account
#  14. Click 'Delete Account' button
#  15. Verify 'ACCOUNT DELETED!' and click 'Continue' button