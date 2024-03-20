package com.test.ec.steps.logout;

import com.test.ec.pages.logout.EditorSwiftLogoutPage;
import net.serenitybdd.annotations.Step;

public class EditorSwiftLogoutStep extends EditorSwiftLogoutPage {
    @Step("Click en el boton de cerrar sesion")
    public void clickCerrarSesion() {
        btn_logout.click();
    }

    @Step("Click en el boton salir")
    public void clickSalir() {
        btn_salir.click();
    }
}
