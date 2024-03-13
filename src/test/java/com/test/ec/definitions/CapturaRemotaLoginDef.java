package com.test.ec.definitions;

import com.test.ec.steps.login.CapturaRemotaLoginStep;
import com.test.ec.steps.validations.CapturaRemotaValidationStep;
import com.test.ec.utilities.sslCertificate.SSLCertified;
import com.test.ec.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class CapturaRemotaLoginDef {
    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    SSLCertified cSSL;

    @Steps(shared = true)
    CapturaRemotaLoginStep login;

    @Steps(shared = true)
    CapturaRemotaValidationStep validate;

    @Given("El usuario navega al sitio web de Captura Remota")
    public void userNavegateTo() {
        url.navegateTo("https://172.20.41.97:8043/CRC/");
        cSSL.certificateSSL();
    }

    @When("Ingresa credenciales correctas de Captura Remota")
    public void userLoginWithValidCredentials() {
        login.typeUsername("MASGAS1");
        login.typePassword("banco*BGR001");
        login.clickLogin();
    }

    @Then("La aplicacion deberia mostrar el modulo principal de Captura Remota")
    public void systemShowProductsModule() {
        Assert.assertTrue(validate.titleIsVisible());
    }

    @When("Ingresa credenciales incorrectas de Captura Remota")
    public void userLoginWithInvalidCredentials() {
        login.typeUsername("MASGAS");
        login.typePassword("123456");
        login.clickLogin();
    }

    @Then("La aplicacion deberia mostrar un mensaje de error de Captura Remota")
    public void systemShowErrorMessage() {
        Assert.assertTrue(validate.errorMessageIsDisplayed());
    }
}
