package com.test.ec.steps.logout;

import com.test.ec.pages.logout.BancaDigitalLogoutPage;
import net.serenitybdd.annotations.Step;

public class BancaDigitalLogoutStep extends BancaDigitalLogoutPage {
    @Step("Click en Cerrar Sesion")
    public void clickCerrarSesion() {
        btn_CerrarSesion.click();
    }
}
