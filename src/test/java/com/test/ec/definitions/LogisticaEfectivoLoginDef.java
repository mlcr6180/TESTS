package com.test.ec.definitions;

import com.test.ec.steps.login.LogisticaEfectivoLoginStep;
import com.test.ec.steps.validations.LogisticaEfectivoValidationStep;
import com.test.ec.utilities.sslCertificate.SSLCertified;
import com.test.ec.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class LogisticaEfectivoLoginDef {
    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    SSLCertified cSSL;

    @Steps(shared = true)
    LogisticaEfectivoLoginStep login;

    @Steps(shared = true)
    LogisticaEfectivoValidationStep validate;

    @Given("El usuario navega al sitio web de Logistica Efectivo")
    public void userNavegateTo() {
        url.navegateTo("https://172.20.41.84:8443/LogisticaEfectivoBGR/Login/Login.aspx");
        cSSL.certificateSSL();
    }

    @When("Ingresa credenciales correctas de Logistica Efectivo")
    public void userLoginWithValidCredentials() {
        login.typeUsername("jamaldon");
        login.typePassword("jmaldon9");
        login.clickLogin();
    }

    @Then("La aplicacion deberia mostrar el modulo principal de Logistica Efectivo")
    public void systemShowProductsModule() {
        Assert.assertTrue(validate.titleIsVisible());
    }

    @When("Ingresa credenciales incorrectas de Logistica Efectivo")
    public void userLoginWithInvalidCredentials() {
        login.typeUsername("jamaldon");
        login.typePassword("123456");
        login.clickLogin();
    }

    @Then("La aplicacion deberia mostrar un mensaje de error de Logistica Efectivo")
    public void systemShowErrorMessage() {
        Assert.assertTrue(validate.errorMessageIsDisplayed());
    }
}
