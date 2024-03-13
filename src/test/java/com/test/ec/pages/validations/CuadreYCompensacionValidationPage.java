package com.test.ec.pages.validations;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CuadreYCompensacionValidationPage extends PageObject {
    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    protected WebElementFacade lbl_product;

    @FindBy(xpath = "//li[contains(@class, 'text-black') and contains(text(), 'PASSWORD INCORRECTO')]")
    protected WebElementFacade lbl_errorMessage;
}
