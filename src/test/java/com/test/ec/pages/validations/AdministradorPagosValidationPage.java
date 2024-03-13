package com.test.ec.pages.validations;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AdministradorPagosValidationPage extends PageObject {
    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    protected WebElementFacade lbl_product;

    @FindBy(xpath = "//span[contains(@class, 'fa fa-lock')]")
    protected WebElementFacade lbl_errorMessage;
}
