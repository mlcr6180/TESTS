package com.test.ec.definitions;

import com.test.ec.steps.login.CuadreYCompensacionLoginStep;
import com.test.ec.steps.validations.CuadreYCompensacionValidationStep;
import com.test.ec.utilities.sslCertificate.SSLCertified;
import com.test.ec.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class CuadreYCompensacionLoginDef {
    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    SSLCertified cSSL;

    @Steps(shared = true)
    CuadreYCompensacionLoginStep login;

    @Steps(shared = true)
    CuadreYCompensacionValidationStep validate;

    @Given("El usuario navega al sitio web de Cuadre y Compensacion")
    public void userNavegateTo() {
        url.navegateTo("http://172.20.41.92:8080/CuadreCompensacionATMs/Login/Login.aspx");
    }

    @When("Ingresa credenciales correctas de Cuadre y Compensacion")
    public void userLoginWithValidCredentials() {
        login.typeUsername("jamaldon");
        login.typePassword("jmaldon9");
        login.clickLogin();
    }

    @Then("La aplicacion deberia mostrar el modulo principal de Cuadre y Compensacion")
    public void systemShowProductsModule() {
        Assert.assertTrue(validate.titleIsVisible());
    }

    @When("Ingresa credenciales incorrectas de Cuadre y Compensacion")
    public void userLoginWithInvalidCredentials() {
        login.typeUsername("jamaldon");
        login.typePassword("123456");
        login.clickLogin();
    }

    @Then("La aplicacion deberia mostrar un mensaje de error de Cuadre y Compensacion")
    public void systemShowErrorMessage() {
        Assert.assertTrue(validate.errorMessageIsDisplayed());
    }
}
