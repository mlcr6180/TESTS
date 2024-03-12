package com.test.ec.pages.login;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class BancaOficialLoginPage extends PageObject {
    @FindBy(id = "txtUsuario")
    protected WebElementFacade txt_username;

    @FindBy(id = "txtContrasena")
    protected WebElementFacade txt_password;

    @FindBy(id = "sbmAceptar")
    protected WebElementFacade btn_login;
}
