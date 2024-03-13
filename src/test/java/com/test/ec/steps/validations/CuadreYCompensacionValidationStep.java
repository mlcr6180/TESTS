package com.test.ec.steps.validations;

import com.test.ec.pages.validations.CuadreYCompensacionValidationPage;
import net.serenitybdd.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CuadreYCompensacionValidationStep extends CuadreYCompensacionValidationPage {
    @Step("Validar visualizacion del modulo principal")
    public Boolean titleIsVisible() {
        Duration tiempoDeEspera = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(getDriver(), tiempoDeEspera);
        wait.until(ExpectedConditions.visibilityOf(lbl_product));
        return lbl_product.isDisplayed();
    }

    @Step("Validar visualizacion del mensaje de error")
    public Boolean errorMessageIsDisplayed() {
        return lbl_errorMessage.isDisplayed();
    }
}
