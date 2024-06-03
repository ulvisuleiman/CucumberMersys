package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _08_DataTableSteps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("Click on the Element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable links) {
        List<String> strLinkList = links.asList(String.class);

        for (int i = 0; i < strLinkList.size(); i++) {
            //System.out.println(strLinkList.get(0));
            WebElement linkWebElement = ln.getWebElement(strLinkList.get(i));
            ln.myClick(linkWebElement);
        }

    }

    @And("Click on the Element in Dialog")
    public void clickOnTheElementInDialog(DataTable buttons) {
        List<String> strButtonsList = buttons.asList(String.class);

        for (int i = 0; i < strButtonsList.size(); i++) {
            //System.out.println(strLinkList.get(0));
            WebElement linkWebElement = dc.getWebElement(strButtonsList.get(i));
            dc.myClick(linkWebElement);
        }
    }

    @And("User sending the keys in Dialog")
    public void userSendingTheKeysInDialog(DataTable textBoxAndTexts) {
        List< List<String> > listTxtYazi= textBoxAndTexts.asLists(String.class);

        for (int i = 0; i < listTxtYazi.size(); i++) {
            WebElement txtBoxWebElement= dc.getWebElement(listTxtYazi.get(i).get(0));
            dc.mySendKeys(txtBoxWebElement, listTxtYazi.get(i).get(1));
        }
    }

    @And("User deleting the Element from Dialog")
    public void userDeletingTheElementFromDialog(DataTable DeletedItems) {
        List<String> strDeleteList = DeletedItems.asList(String.class);

        for (int i = 0; i < strDeleteList.size(); i++) {
            //System.out.println(strLinkList.get(0));
            WebElement linkWebElement = dc.getWebElement(strDeleteList.get(i));
            dc.deleteItem(strDeleteList.get(i));
        }
    }
}
