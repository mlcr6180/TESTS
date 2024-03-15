package com.test.ec.steps.logout;

import com.test.ec.pages.logout.AdministracionBancaDigitalLogoutPage;
import net.serenitybdd.annotations.Step;

import java.util.concurrent.TimeUnit;

public class AdministracionBancaDigitalLogoutStep extends AdministracionBancaDigitalLogoutPage {
    @Step("Click en Centro de Administracion Omnibanca")
    public void clickCentroAdministracionOmnibanca() {
        lbl_centroAministracionOmnibanca.click();
    }

    @Step("Click en Administracion de Usuarios")
    public void clikAdministracionUsuarios() {
        lbl_administacionUsuarios.click();
    }

    @Step("Click en Cerrar Sesion")
    public void clickCerrarSesion() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        btn_cerrarSesion.click();
    }

    @Step("Click en Salir")
    public void clickSalir() {
        btn_salir.click();
    }
}
