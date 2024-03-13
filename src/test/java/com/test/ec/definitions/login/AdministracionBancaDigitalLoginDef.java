package com.test.ec.definitions.login;

import com.test.ec.steps.login.AdministracionBancaDigitalLoginStep;
import com.test.ec.steps.validations.AdministracionBancaDigitalValidationStep;
import com.test.ec.utilities.sslCertificate.SSLCertified;
import com.test.ec.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class AdministracionBancaDigitalLoginDef {
    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    SSLCertified cSSL;

    @Steps(shared = true)
    AdministracionBancaDigitalLoginStep login;

    @Steps(shared = true)
    AdministracionBancaDigitalValidationStep validate;

    @Given("El usuario navega al sitio web de Administracion Banca Digital")
    public void userNavegateTo() {
        url.navegateTo("https://bd-test.bgr.ec/web/guest/adminportalbgr");
    }

    @When("Ingresa credenciales correctas de Administracion Banca Digital")
    public void userLoginWithValidCredentials() {
        login.typeUsername("tcsmonitor");
        login.typePassword("123*abcD");
        login.clickLogin();
    }

    @Then("La aplicacion deberia mostrar el modulo principal de Administracion Banca Digital")
    public void systemShowProductsModule() {
        Assert.assertTrue(validate.titleIsVisible());
    }

    @When("Ingresa credenciales incorrectas de Administracion Banca Digital")
    public void userLoginWithInvalidCredentials() {
        login.typeUsername("tcsmonitor");
        login.typePassword("123456");
        login.clickLogin();
    }

    @Then("La aplicacion deberia mostrar un mensaje de error de Administracion Banca Digital")
    public void systemShowErrorMessage() {
        Assert.assertTrue(validate.errorMessageIsDisplayed());
    }
}
