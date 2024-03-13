package com.test.ec.pages.login;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AdministracionBancaDigitalLoginPage extends PageObject {
    @FindBy(id = "_com_liferay_login_web_portlet_LoginPortlet_login")
    protected WebElementFacade txt_username;

    @FindBy(id = "_com_liferay_login_web_portlet_LoginPortlet_password")
    protected WebElementFacade txt_password;

    @FindBy(xpath = "//button[@type='submit']")
    protected WebElementFacade btn_login;
}
