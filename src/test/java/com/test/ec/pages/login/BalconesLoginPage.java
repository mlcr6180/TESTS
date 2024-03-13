package com.test.ec.pages.login;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class BalconesLoginPage extends PageObject {
    @FindBy(id = "Login2_TBUsuario")
    protected WebElementFacade txt_username;

    @FindBy(id = "Login2_TBClave")
    protected WebElementFacade txt_password;

    @FindBy(id = "Login2_BIngresar")
    protected WebElementFacade btn_login;
}
