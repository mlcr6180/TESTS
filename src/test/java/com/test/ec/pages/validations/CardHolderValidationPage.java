package com.test.ec.pages.validations;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.FindBy;

public class CardHolderValidationPage extends PageObject {
    @FindBy(xpath = "//frame[@src='entorno/chlHeader.aspx']")
    protected WebElementFacade lbl_product;

    public boolean isAlertPresent() {
        try {
            getDriver().switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
