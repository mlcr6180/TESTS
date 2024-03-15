package com.test.ec.pages.logout;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AdministradorPagosLogoutPage extends PageObject {
    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    protected WebElementFacade btn_cerrarSesion;

    @FindBy(xpath = "//a[@id='ctl00_btnSalir2']")
    protected WebElementFacade btn_salir;
}
