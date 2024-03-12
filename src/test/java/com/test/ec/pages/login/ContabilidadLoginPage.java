package com.test.ec.pages.login;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ContabilidadLoginPage extends PageObject {
    @FindBy(id = "TBUsuario")
    protected WebElementFacade txt_username;

    @FindBy(id = "TBClave")
    protected WebElementFacade txt_password;

    @FindBy(id = "BIngresar")
    protected WebElementFacade btn_login;
}
