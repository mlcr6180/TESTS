package com.test.ec.pages.logout;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CardHolderLogoutPage extends PageObject {
    @FindBy(xpath = "//frame[@src='entorno/chlHeader.aspx']")
    protected WebElementFacade frame_header;

    @FindBy(xpath = "//a[@href='chlSalir.aspx']")
    protected WebElementFacade btn_cerrarSesion;
}
