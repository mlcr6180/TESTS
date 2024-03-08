package com.test.ec.definitions;

import com.test.ec.steps.login.AccionesYAccionistasLoginStep;
import com.test.ec.steps.validations.AccionesYAccionistasValidationStep;
import com.test.ec.utilities.certifiedSSL.CertifiedSSL;
import com.test.ec.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class AccionesYAccionistasLoginDef {
    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    CertifiedSSL cSSL;

    @Steps(shared = true)
    AccionesYAccionistasLoginStep login;

    @Steps(shared = true)
    AccionesYAccionistasValidationStep validate;

    @Given("El usuario navega al sitio web")
    public void userNavigateTo() {
        url.navegateTo("https://172.20.41.84:8443/AccionesAccionistasBGR/Login/Login.aspx");
        cSSL.certificateSSL();
    }

    @When("Ingresa credenciales correctas")
    public void userLoginWithValidCredentials() {
        login.typeUsername("jmeras");
        login.typePassword("Banco10");
        login.clickLogin();
    }

    @Then("La aplicacion deberia mostrar el modulo principal de Acciones y Accionistas")
    public void systemShowProductsModule() {
        Assert.assertTrue(validate.titleIsVisible());
    }

    @When("Ingresa credenciales incorrectas")
    public void userLoginWithInvalidCredentials() {
        login.typeUsername("jmeras");
        login.typePassword("123456");
        login.clickLogin();
    }

    @Then("La aplicacion deberia mostrar un mensaje de error")
    public void systemShowErrorMessage() {
        Assert.assertTrue(validate.errorMessageIsDisplayed());
    }
}
