package com.test.ec.pages.logout;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AsesoresLogoutPage extends PageObject {
    @FindBy(xpath = "//frame[@src='header.aspx']")
    protected WebElementFacade frame_header;

    @FindBy(xpath = "//a[@class='Login.aspx']")
    protected WebElementFacade btn_cerrarSesion;
}
