package com.test.ec.steps.validations;

import com.test.ec.pages.validations.BalconesValidationPage;
import net.serenitybdd.annotations.Step;

public class BalconesValidationStep extends BalconesValidationPage {
    @Step("Validar visualizacion del modulo principal")
    public Boolean titleIsVisible() {
        return lbl_product.isDisplayed();
    }

    @Step("Validar visualizacion del mensaje de error")
    public Boolean errorMessageIsDisplayed() {
        return isAlertPresent();
    }
}
