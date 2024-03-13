package com.test.ec.definitions;

import com.test.ec.steps.login.AsesoresLoginStep;
import com.test.ec.steps.validations.AsesoresValidationStep;
import com.test.ec.utilities.sslCertificate.SSLCertified;
import com.test.ec.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class AsesoresLoginDef {
    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    SSLCertified cSSL;

    @Steps(shared = true)
    AsesoresLoginStep login;

    @Steps(shared = true)
    AsesoresValidationStep validate;

    @Given("El usuario navega al sitio web de Asesores")
    public void userNavegateTo() {
        url.navegateTo("https://172.20.41.84:8443/WEBPichinchaCom/AsesoresCom/Entorno/Login.aspx");
        cSSL.certificateSSL();
    }

    @When("Ingresa credenciales correctas de Asesores")
    public void userLoginWithValidCredentials() {
        login.typeUsername("jamaldon");
        login.typePassword("jmaldon9");
        login.clickLogin();
    }

    @Then("La aplicacion deberia mostrar el modulo principal de Asesores")
    public void systemShowProductsModule() {
        Assert.assertTrue(validate.titleIsVisible());
    }

    @When("Ingresa credenciales incorrectas de Asesores")
    public void userLoginWithInvalidCredentials() {
        login.typeUsername("jamaldon");
        login.typePassword("123456");
        login.clickLogin();
    }

    @Then("La aplicacion deberia mostrar un mensaje de error de Asesores")
    public void systemShowErrorMessage() {
        Assert.assertTrue(validate.errorMessageIsDisplayed());
    }
}
