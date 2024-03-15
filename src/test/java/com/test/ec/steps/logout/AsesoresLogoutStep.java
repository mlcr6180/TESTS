package com.test.ec.steps.logout;

import com.test.ec.pages.logout.AsesoresLogoutPage;
import net.serenitybdd.annotations.Step;

public class AsesoresLogoutStep extends AsesoresLogoutPage {
    @Step("Seleccionar en el Frame Header")
    public void seleccionarFrameHeader() {
        frame_header.select();
    }

    @Step("Click en Cerrar Sesión")
    public void clickCerrarSesion() {
        btn_cerrarSesion.click();
    }
}
