package com.test.ec.pages.login;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class BIZAGILoginPage extends PageObject {
    @FindBy(xpath = "//input[@class='input-field']")
    protected WebElementFacade txt_username;

    @FindBy(xpath = "//input[@class='input-field input-field--icon_right']")
    protected WebElementFacade txt_password;

    @FindBy(xpath = "//button[@class='button button-primary']")
    protected WebElementFacade btn_login;
}
