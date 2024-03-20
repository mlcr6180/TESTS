package com.test.ec.pages.logout;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class BancaDigitalLogoutPage extends PageObject {
    @FindBy(xpath = "//a[contains(@class,'bottom nav-link')]//span[1]")
    protected WebElementFacade btn_CerrarSesion;
}
