package com.test.ec.steps.logout;

import com.test.ec.pages.logout.ContabilidadLogoutPage;
import net.serenitybdd.annotations.Step;

public class ContabilidadLogoutStep extends ContabilidadLogoutPage {
    @Step("Seleccionar frame Menu Contabilidad")
    public void selectFrameMenuContabilidad() {
        getDriver().switchTo().frame(frame_menuContabilidad);
    }

    @Step("Click en Cerrar Sesion")
    public void clickCerrarSesion() {
        btn_cerrarSesion.click();
    }

    @Step("Click en Salir")
    public void clickSalir() {
        btn_Salir.click();
    }
}
