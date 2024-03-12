package com.test.ec.pages.login;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class EditorSwiftLoginPage extends PageObject {
    @FindBy(id = "txtUsuario")
    protected WebElementFacade txt_username;

    @FindBy(id = "txtClaveUsuario")
    protected WebElementFacade txt_password;

    @FindBy(id = "cmdAceptar")
    protected WebElementFacade btn_login;
}
