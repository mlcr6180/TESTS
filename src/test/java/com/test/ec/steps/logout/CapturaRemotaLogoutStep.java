package com.test.ec.steps.logout;

import com.test.ec.pages.logout.CapturaRemotaLogoutPage;
import net.serenitybdd.annotations.Step;

public class CapturaRemotaLogoutStep extends CapturaRemotaLogoutPage {
    @Step("Click en Cerrar Sesion")
    public void clickCerrarSesion() {
        btn_CerrarSesion.click();
    }
}
