package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _03_CitizenShip {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("Navigate to CitizenShip")
    public void navigateToCitizenShip() {
        ln.myClick(ln.setup);
        ln.myClick(ln.parameters);
        ln.myClick(ln.citizenship);
    }

    @When("Create a citizenship")
    public void createACitizenship() {
        String citizenshipName = RandomStringUtils.randomAlphanumeric(8); // 8 harf ver
        String citizenshipShortName = RandomStringUtils.randomAlphanumeric(4); // 4 harf ver

        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput, citizenshipName);
        dc.mySendKeys(dc.shortNameInput, citizenshipShortName);
        dc.myClick(dc.saveButton);
    }

    @When("Create a citizenship name as {string} code as {string}")
    public void createACitizenshipNameAsCodeAs(String citizenshipName, String citizenshipShortName) {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput, citizenshipName);
        dc.mySendKeys(dc.shortNameInput, citizenshipShortName);
        dc.myClick(dc.saveButton);
    }

    @Then("Already exist message should be displayed")
    public void alreadyExistMessageShouldBeDisplayed() {
        dc.verifyContainsText(dc.alreadyExist, "already");
    }


    @When("user delete name as {string}")
    public void userDeleteNameAs(String deleteName) {
        dc.deleteItem(deleteName);
    }
}