package com.test.ec.steps.validations;

import com.test.ec.pages.validations.ValidationPage;
import net.serenitybdd.annotations.Step;

public class ValidationStep extends ValidationPage {
    @Step("Validar visualizacion del modulo de productos")
    public Boolean titleIsVisible() {
        return lbl_product.isDisplayed();
    }

    @Step("Validad visualizacion del mensaje de error")
    public Boolean errorMessageIsDisplayed() {
        return lbl_errorMessage.isDisplayed();
    }
}
