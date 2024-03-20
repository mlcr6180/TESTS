package com.test.ec.steps.logout;

import com.test.ec.pages.logout.EstructurasControlLogoutPage;
import net.serenitybdd.annotations.Step;

public class EstructurasControlLogoutStep extends EstructurasControlLogoutPage {
    @Step("Click en el boton de cerrar sesion")
    public void clickCerrarSesion() {
        btn_logout.click();
    }

    @Step("Click en el boton salir")
    public void clickSalir() {
        btn_salir.click();
    }
}
