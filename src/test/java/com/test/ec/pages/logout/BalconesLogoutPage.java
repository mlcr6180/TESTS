package com.test.ec.pages.logout;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class BalconesLogoutPage extends PageObject {
    @FindBy(xpath = "//frame[@src='EscritorioCabecera.aspx']")
    protected WebElementFacade frame_header;

    @FindBy(xpath = "//a[@href=\"Login.aspx\"]")
    protected WebElementFacade btn_cerrarSesion;
}
