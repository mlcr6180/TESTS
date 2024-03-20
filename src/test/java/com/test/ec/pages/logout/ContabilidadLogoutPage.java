package com.test.ec.pages.logout;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ContabilidadLogoutPage extends PageObject {
    @FindBy(xpath = "//frame[@src='MenuContabilidad.aspx']")
    protected WebElementFacade frame_menuContabilidad;

    @FindBy(xpath = "//a[contains(@href, '#') and contains(text(), 'Salir')]")
    protected WebElementFacade btn_cerrarSesion;

    @FindBy(xpath = "//a[contains(@href, '/WebPichinchaCom/ContabilidadCom/Entorno/Login.aspx') and contains(text(), 'Salir de Contabilidad')]")
    protected WebElementFacade btn_Salir;
}
