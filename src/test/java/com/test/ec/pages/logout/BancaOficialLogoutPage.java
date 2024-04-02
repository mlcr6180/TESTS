package com.test.ec.pages.logout;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class BancaOficialLogoutPage extends PageObject {
    @FindBy(xpath = "//frame[@src='Entorno/Cabecera.aspx']")
    protected WebElementFacade frame_header;

    @FindBy(xpath = "//img[@src='../images/icons/close.gif']")
    protected WebElementFacade btn_cerrarSesion;
}
