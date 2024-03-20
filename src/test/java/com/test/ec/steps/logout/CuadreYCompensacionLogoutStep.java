package com.test.ec.steps.logout;

import com.test.ec.pages.logout.CuadreYCompensacionLogoutPage;
import net.serenitybdd.annotations.Step;

public class CuadreYCompensacionLogoutStep extends CuadreYCompensacionLogoutPage {
    @Step("Click en el boton de cerrar sesion")
    public void clickCerrarSesion() {
        btn_logout.click();
    }

    @Step("Click en el boton salir")
    public void clickSalir() {
        btn_salir.click();
    }
}
