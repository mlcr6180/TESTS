package com.test.ec.pages.validations;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class AccionesYAccionistasValidationPage extends PageObject {
    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    protected WebElementFacade lbl_product;

    @FindBy(xpath = "//li[contains(@class, 'text-black') and contains(text(), 'PASSWORD INCORRECTO')]")
    protected WebElementFacade lbl_errorMessage;

    @FindBy(id = "txtUsuario")
    protected WebElementFacade txt_username;
}
