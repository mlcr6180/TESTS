package com.test.ec.pages.login;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class BancaDigitalLoginPage extends PageObject {
    @FindBy(name = "username")
    protected WebElementFacade txt_username;

    @FindBy(name = "password")
    protected WebElementFacade txt_password;

    @FindBy(xpath = "//*[@id=\"ob-login-content\"]/authentication/section[1]/form/div/div/div/div/div[7]/div/button")
    protected WebElementFacade btn_login;
}
