package com.test.ec.pages.login;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CapturaRemotaLoginPage extends PageObject {
    @FindBy(id = "ASPxRoundPanel1_ASPxFormLayout1_txtUsuario_I")
    protected WebElementFacade txt_username;

    @FindBy(id = "ASPxRoundPanel1_ASPxFormLayout1_txtClave_I")
    protected WebElementFacade txt_password;

    @FindBy(id = "ASPxRoundPanel1_ASPxFormLayout1_cmdIngresar")
    protected WebElementFacade btn_login;
}
