package com.test.ec.pages.validations;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class BancaOficialValidationPage extends PageObject {
    @FindBy(xpath = "//frame[@src='Entorno/Cabecera.aspx']")
    protected WebElementFacade lbl_product;

    @FindBy(xpath = "//span[@id='lblMensaje']")
    protected WebElementFacade lbl_errorMessage;
}
