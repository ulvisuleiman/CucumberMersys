package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LeftNav extends ParentPage {
    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;

    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    public WebElement countries;

    @FindBy(xpath = "(//span[text()='Citizenships'])[1]")
    public WebElement citizenship;

    @FindBy(xpath = "(//span[text()='Nationalities'])[1]")
    public WebElement nationalities;

    @FindBy(xpath = "//span[text()='Fees']")
    public WebElement fees;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    public WebElement entranceExam;

    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    public WebElement setupExam;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    public WebElement entranceExamSet;

    @FindBy(xpath = "(//span[text()='Inventory'])[1]")
    public WebElement inventory;

    @FindBy(xpath = "(//span[text()='Setup'])[4]")
    public WebElement setupInv;

    @FindBy(xpath = "//span[text()='Item Categories']")
    public WebElement itemCategories;

    @FindBy(xpath = "//span[text()='States']")
    public WebElement states;



    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "setup":
                return this.setup;
            case "parameters":
                return this.parameters;
            case "countries":
                return this.countries;
            case "citizenship":
                return this.citizenship;
            case "nationalities":
                return this.nationalities;
            case "fees":
                return this.fees;
            case "entranceExam":
                return this.entranceExam;
            case "setupExam":
                return this.setupExam;
            case "entranceExamSet":
                return this.entranceExamSet;
            case "inventory":
                return this.inventory;
            case "setupInv":
                return this.setupInv;
            case "itemCategories":
                return this.itemCategories;
            case "states":
                return this.states;
        }
        return null;
    }
}
