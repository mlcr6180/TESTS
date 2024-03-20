package com.test.ec.steps.validations;

import com.test.ec.pages.validations.EstructurasControlValidationPage;
import net.serenitybdd.annotations.Step;

public class EstructurasControlValidationStep extends EstructurasControlValidationPage {
    @Step("Validar visualizacion del modulo principal")
    public Boolean titleIsVisible() {
        return lbl_product.isDisplayed();
    }

    @Step("Validar visualizacion del mensaje de error")
    public Boolean errorMessageIsDisplayed() {
        return lbl_errorMessage.isDisplayed();
    }

    @Step("Validar cierre de sesion")
    public Boolean txt_usernameIsVisible() {
        return txt_username.isDisplayed();
    }
}
