package com.test.ec.steps.logout;

import com.test.ec.pages.logout.CardHolderLogoutPage;
import net.serenitybdd.annotations.Step;

public class CardHolderLogoutStep extends CardHolderLogoutPage {
    @Step("Seleccionar frame header")
    public void selectFrameHeader() {
        getDriver().switchTo().frame(frame_header);
    }

    @Step("Click en Cerrar Sesion")
    public void clickCerrarSesion() {
        btn_cerrarSesion.click();
    }
}
