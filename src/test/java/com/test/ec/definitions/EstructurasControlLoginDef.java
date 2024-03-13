package com.test.ec.definitions;

import com.test.ec.steps.login.EstructurasControlLoginStep;
import com.test.ec.steps.validations.EstructurasControlValidationStep;
import com.test.ec.utilities.sslCertificate.SSLCertified;
import com.test.ec.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class EstructurasControlLoginDef {
    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    SSLCertified cSSL;

    @Steps(shared = true)
    EstructurasControlLoginStep login;

    @Steps(shared = true)
    EstructurasControlValidationStep validate;

    @Given("El usuario navega al sitio web de Estructuras Control")
    public void userNavegateTo() {
        url.navegateTo("https://172.20.41.84:8443/EstructurasControlBGR/Login/Login.aspx");
        cSSL.certificateSSL();
    }

    @When("Ingresa credenciales correctas de Estructuras Control")
    public void userLoginWithValidCredentials() {
        login.typeUsername("jamaldon");
        login.typePassword("jmaldon9");
        login.clickLogin();
    }

    @Then("La aplicacion deberia mostrar el modulo principal de Estructuras Control")
    public void systemShowProductsModule() {
        Assert.assertTrue(validate.titleIsVisible());
    }

    @When("Ingresa credenciales incorrectas de Estructuras Control")
    public void userLoginWithInvalidCredentials() {
        login.typeUsername("jamaldon");
        login.typePassword("123456");
        login.clickLogin();
    }

    @Then("La aplicacion deberia mostrar un mensaje de error de Estructuras Control")
    public void systemShowErrorMessage() {
        Assert.assertTrue(validate.errorMessageIsDisplayed());
    }
}
