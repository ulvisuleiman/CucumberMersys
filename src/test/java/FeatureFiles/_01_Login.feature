# Login fonksiyon kontrolu
# Siteye git (driver.git)
# Login bilgilerini gir (username password sendkeys)
# giris yaptigini kontrol (verify)

# gherkin language

@SmokeTest @Regression
Feature: Login functionality

  Scenario: Login with valid username and password

    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

