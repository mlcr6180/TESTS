package com.test.ec.pages.validations;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AdministracionBancaDigitalValidationPage extends PageObject {
    @FindBy(xpath = "//a[@aria-label='Menú']")
    protected WebElementFacade lbl_product;

    @FindBy(xpath = "//button[@type='submit']")
    protected WebElementFacade lbl_errorMessage;

    @FindBy(xpath = "//button[@class='btn btn-primary ob-primary btn-block']")
    protected WebElementFacade btn_iniciarSesion;
}
