package com.test.ec.pages.validations;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class BIZAGIValidationPage extends PageObject {
    @FindBy(xpath = "//i[contains(@class,'adm-user bz-icon bz-icon-16 bz-icon-cog-outline')]")
    protected WebElementFacade lbl_product;

    @FindBy(xpath = "//p[@class='secondary-data']")
    protected WebElementFacade lbl_errorMessage;

    @FindBy(xpath = "//input[@class='input-field']")
    protected WebElementFacade txt_username;
}
