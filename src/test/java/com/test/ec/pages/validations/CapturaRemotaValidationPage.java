package com.test.ec.pages.validations;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CapturaRemotaValidationPage extends PageObject {
    @FindBy(xpath = "//span[text()='Salir']")
    protected WebElementFacade lbl_product;

    @FindBy(xpath = "//span[text()='Usuario o contraseña inválida.']")
    protected WebElementFacade lbl_errorMessage;

    @FindBy(id = "ASPxRoundPanel1_ASPxFormLayout1_txtUsuario_I")
    protected WebElementFacade txt_username;
}
