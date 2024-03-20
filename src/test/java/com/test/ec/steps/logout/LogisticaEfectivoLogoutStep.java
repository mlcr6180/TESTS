package com.test.ec.steps.logout;

import com.test.ec.pages.logout.LogisticaEfectivoLogoutPage;
import net.serenitybdd.annotations.Step;

public class LogisticaEfectivoLogoutStep extends LogisticaEfectivoLogoutPage {
    @Step("Click en el boton de cerrar sesion")
    public void clickCerrarSesion() {
        btn_logout.click();
    }

    @Step("Click en el boton salir")
    public void clickSalir() {
        btn_salir.click();
    }
}
