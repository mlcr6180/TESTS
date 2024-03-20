package com.test.ec.pages.logout;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class BIZAGILogoutPage extends PageObject {
    @FindBy(xpath = "//i[contains(@class,'adm-user bz-icon')]")
    protected WebElementFacade btn_CerrarSesion;

    @FindBy(xpath = "//li[@id='logout']")
    protected WebElementFacade btn_Salir;
}
