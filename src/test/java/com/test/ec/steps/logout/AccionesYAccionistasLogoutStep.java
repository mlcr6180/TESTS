package com.test.ec.steps.logout;

import com.test.ec.pages.logout.AccionesYAccionistasLogoutPage;
import net.serenitybdd.annotations.Step;

public class AccionesYAccionistasLogoutStep extends AccionesYAccionistasLogoutPage {
    @Step("Click en el boton de cerrar sesión")
    public void clickCerrarSesion() {
        btn_logout.click();
    }

    @Step("Click en el boton salir")
    public void clickSalir() {
        btn_salir.click();
    }
}
