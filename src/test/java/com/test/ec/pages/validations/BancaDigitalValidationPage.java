package com.test.ec.pages.validations;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class BancaDigitalValidationPage extends PageObject {
    @FindBy(xpath = "//div[@class='sidebar-portlet']")
    protected WebElementFacade lbl_product;

    @FindBy(xpath = "//span[@class='alert-text']")
    protected WebElementFacade lbl_errorMessage;

    @FindBy(xpath = "//button[@class='btn btn-primary ob-primary btn-block']")
    protected WebElementFacade btn_iniciarSesion;
}
