package com.test.ec.pages.validations;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class BIZAGIValidationPage extends PageObject {
    @FindBy(xpath = "//i[contains(@class,'adm-user bz-icon')]")
    protected WebElementFacade lbl_product;

    @FindBy(xpath = "//div[@class='login-message']")
    protected WebElementFacade lbl_errorMessage;
}
