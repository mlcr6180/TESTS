package com.test.ec.pages.validations;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class EstructurasControlValidationPage extends PageObject {
    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    protected WebElementFacade lbl_product;

    @FindBy(xpath = "//li[contains(@class, 'text-black') and contains(text(), 'USUARIO O CLAVE INCORRECTA')]")
    protected WebElementFacade lbl_errorMessage;

    @FindBy(id = "txtUsuario")
    protected WebElementFacade txt_username;
}
