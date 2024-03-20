package com.test.ec.steps.logout;

import com.test.ec.pages.logout.BIZAGILogoutPage;
import net.serenitybdd.annotations.Step;

public class BIZAGILogoutStep extends BIZAGILogoutPage {
    @Step("Clic en Cerrar Sesion")
    public void clickCerrarSesion() {
        btn_CerrarSesion.click();
    }

    @Step("Click en Salir")
    public void clickSalir() {
        btn_Salir.click();
    }
}
