package com.test.ec.definitions.login;

import com.test.ec.steps.login.AdministradorPagosLoginStep;
import com.test.ec.steps.validations.AdministradorPagosValidationStep;
import com.test.ec.utilities.sslCertificate.SSLCertified;
import com.test.ec.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class AdministradorPagosLoginDef {
    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    SSLCertified cSSL;

    @Steps(shared = true)
    AdministradorPagosLoginStep login;

    @Steps(shared = true)
    AdministradorPagosValidationStep validate;

    @Given("El usuario navega al sitio web de Administrador Pagos")
    public void userNavegateTo() {
        url.navegateTo("https://172.20.41.84:8443/AdministradorPagosBGR/Login/Login.aspx");
        cSSL.certificateSSL();
    }

    @When("Ingresa credenciales correctas de Administrador Pagos")
    public void userLoginWithValidCredentials() {
        login.typeUsername("jamaldon");
        login.typePassword("jmaldon9");
        login.clickLogin();
    }

    @Then("La aplicacion deberia mostrar el modulo principal de Administrador Pagos")
    public void systemShowProductsModule() {
        Assert.assertTrue(validate.titleIsVisible());
    }

    @When("Ingresa credenciales incorrectas de Administrador Pagos")
    public void userLoginWithInvalidCredentials() {
        login.typeUsername("jamaldon");
        login.typePassword("123456");
        login.clickLogin();
    }

    @Then("La aplicacion deberia mostrar un mensaje de error de Administrador Pagos")
    public void systemShowErrorMessage() {
        Assert.assertTrue(validate.errorMessageIsDisplayed());
    }
}
