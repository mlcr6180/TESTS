package com.test.ec.definitions;

import com.test.ec.steps.login.BIZAGILoginStep;
import com.test.ec.steps.validations.BIZAGIValidationStep;
import com.test.ec.utilities.sslCertificate.SSLCertified;
import com.test.ec.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class BIZAGILoginDef {
    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    SSLCertified cSSL;

    @Steps(shared = true)
    BIZAGILoginStep login;

    @Steps(shared = true)
    BIZAGIValidationStep validate;

    @Given("El usuario navega al sitio web de BIZAGI")
    public void userNavegateTo() {
        url.navegateTo("https://172.20.41.101:4433/BPMBGRT/");
        cSSL.certificateSSL();
    }

    @When("Ingresa credenciales correctas de BIZAGI")
    public void userLoginWithValidCredentials() {
        login.typeUsername("jamaldon");
        login.typePassword("jmaldon9");
        login.clickLogin();
    }

    @Then("La aplicacion deberia mostrar el modulo principal de BIZAGI")
    public void systemShowProductsModule() {
        Assert.assertTrue(validate.titleIsVisible());
    }

    @When("Ingresa credenciales incorrectas de BIZAGI")
    public void userLoginWithInvalidCredentials() {
        login.typeUsername("jamaldon");
        login.typePassword("123456");
        login.clickLogin();
    }

    @Then("La aplicacion deberia mostrar un mensaje de error de BIZAGI")
    public void systemShowErrorMessage() {
        Assert.assertTrue(validate.errorMessageIsDisplayed());
    }
}
