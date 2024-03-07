package com.test.ec.pages.login;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AccionesYAccionistasLoginPage extends PageObject {
    @FindBy(id = "txtUsuario")
    protected WebElementFacade txt_username;

    @FindBy(id = "txtClaveUsuario")
    protected WebElementFacade txt_password;

    @FindBy(id = "cmdAceptar")
    protected WebElementFacade btn_login;
}
