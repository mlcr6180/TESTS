package com.test.ec.definitions.login;

import com.test.ec.steps.login.BancaDigitalLoginStep;
import com.test.ec.steps.validations.BancaDigitalValidationStep;
import com.test.ec.utilities.sslCertificate.SSLCertified;
import com.test.ec.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class BancaDigitalLoginDef {
    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    SSLCertified cSSL;

    @Steps(shared = true)
    BancaDigitalLoginStep login;

    @Steps(shared = true)
    BancaDigitalValidationStep validate;

    @Given("El usuario navega al sitio web de Banca Digital")
    public void userNavigateTo() {
        url.navegateTo("https://bd-test.bgr.ec/");
    }

    @When("Ingresa credenciales correctas de Banca Digital")
    public void userLoginWithValidCredentials() {
        login.typeUsername("jahaira2000");
        login.typePassword("Consultec22.");
        login.clickLogin();
    }

    @Then("La aplicacion deberia mostrar el modulo principal de Banca Digital")
    public void systemShowProductsModule() {
        Assert.assertTrue(validate.titleIsVisible());
    }

    @When("Ingresa credenciales incorrectas de Banca Digital")
    public void userLoginWithInvalidCredentials() {
        login.typeUsername("jahaira2000");
        login.typePassword("123456");
        login.clickLogin();
    }

    @Then("La aplicacion deberia mostrar un mensaje de error de Banca Digital")
    public void systemShowErrorMessage() {
        Assert.assertTrue(validate.errorMessageIsDisplayed());
    }
}
