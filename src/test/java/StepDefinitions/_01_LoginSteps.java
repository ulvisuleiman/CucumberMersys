package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.*;

public class _01_LoginSteps {
    DialogContent dc = new DialogContent();

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        System.out.println("Site acildi");
        GWD.getDriver().get("https://test.mersys.io/");
    }

    @When("Enter username and password and click login button")
    public void enter_username_and_password_and_click() {
        System.out.println("Username ve sifre gonderildi");

//        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.visibilityOf(dc.username));
//
//        dc.username.sendKeys("turkeyts");
//        dc.password.sendKeys("TechnoStudy123");
//        dc.loginButton.click();

        dc.mySendKeys(dc.username, "turkeyts");
        dc.mySendKeys(dc.password, "TechnoStudy123");
        dc.myClick(dc.loginButton);
    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {
        System.out.println("Siteye girildiği kontrol edildi");

//        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.textToBePresentInElement(dc.headText, "Internship"));
//
//        Assert.assertTrue(dc.headText.getText().equals("Internship"));

        dc.verifyContainsText(dc.headText, "Internship");
    }

}
