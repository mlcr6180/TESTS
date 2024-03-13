package com.test.ec.pages.validations;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CapturaRemotaValidationPage extends PageObject {
    @FindBy(xpath = "//span[text()='Salir']")
    protected WebElementFacade lbl_product;

    @FindBy(xpath = "//span[text()=\"Datos ingresados incorrectos. S01\"]")
    protected WebElementFacade lbl_errorMessage;
}
