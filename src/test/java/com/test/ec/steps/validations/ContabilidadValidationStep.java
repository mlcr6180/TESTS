package com.test.ec.steps.validations;

import com.test.ec.pages.validations.ContabilidadValidationPage;
import net.serenitybdd.annotations.Step;

public class ContabilidadValidationStep extends ContabilidadValidationPage {
    @Step("Validar visualizacion del modulo principal")
    public Boolean titleIsVisible() {
        return lbl_product.isDisplayed();
    }

    @Step("Validar visualizacion del mensaje de error")
    public Boolean errorMessageIsDisplayed() {
        return isAlertPresent();
    }
}
