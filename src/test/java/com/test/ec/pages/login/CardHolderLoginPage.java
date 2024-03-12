package com.test.ec.pages.login;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CardHolderLoginPage extends PageObject {
    @FindBy(id = "txtUsuario")
    protected WebElementFacade txt_username;

    @FindBy(id = "txtClave")
    protected WebElementFacade txt_password;

    @FindBy(id = "btnIngresar")
    protected WebElementFacade btn_login;
}
