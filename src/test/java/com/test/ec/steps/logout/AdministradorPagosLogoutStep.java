package com.test.ec.steps.logout;

import com.test.ec.pages.logout.AdministradorPagosLogoutPage;
import net.serenitybdd.annotations.Step;

public class AdministradorPagosLogoutStep extends AdministradorPagosLogoutPage {
    @Step("Click en Cerrar Sesion")
    public void clickCerrarSesion() {
        btn_cerrarSesion.click();
    }

    @Step("Click en Salir")
    public void clickSalir() {
        btn_salir.click();
    }
}
