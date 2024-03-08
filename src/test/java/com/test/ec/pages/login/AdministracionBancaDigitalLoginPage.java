package com.test.ec.pages.login;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AdministracionBancaDigitalLoginPage extends PageObject {
    @FindBy(id = "_com_liferay_login_web_portlet_LoginPortlet_login")
    protected WebElementFacade txt_username;

    @FindBy(id = "_com_liferay_login_web_portlet_LoginPortlet_password")
    protected WebElementFacade txt_password;

    @FindBy(id = "_com_liferay_login_web_portlet_LoginPortlet_sdme")
    protected WebElementFacade btn_login;
}
