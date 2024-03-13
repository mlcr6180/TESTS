package com.test.ec.definitions.login;

import com.test.ec.steps.login.ContabilidadLoginStep;
import com.test.ec.steps.validations.ContabilidadValidationStep;
import com.test.ec.utilities.sslCertificate.SSLCertified;
import com.test.ec.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class ContabilidadLoginDef {
    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    SSLCertified cSSL;

    @Steps(shared = true)
    ContabilidadLoginStep login;

    @Steps(shared = true)
    ContabilidadValidationStep validate;

    @Given("El usuario navega al sitio web de Contabilidad")
    public void userNabvegateTo() {
        url.navegateTo("https://172.20.41.84:8443/WebPichinchaCom/ContabilidadCom/Entorno/Login.aspx");
        cSSL.certificateSSL();
    }

    @When("Ingresa credenciales correctas de Contabilidad")
    public void userLoginWithValidCredentials() {
        login.typeUsername("jamaldon");
        login.typePassword("jmaldon9");
        login.clickLogin();
    }

    @Then("La aplicacion deberia mostrar el modulo principal de Contabilidad")
    public void systemShowProductsModule() {
        Assert.assertTrue(validate.titleIsVisible());
    }

    @When("Ingresa credenciales incorrectas de Contabilidad")
    public void userLoginWithInvalidCredentials() {
        login.typeUsername("jamaldon");
        login.typePassword("123456");
        login.clickLogin();
    }

    @Then("La aplicacion deberia mostrar un mensaje de error de Contabilidad")
    public void systemShowErrorMessage() {
        Assert.assertTrue(validate.errorMessageIsDisplayed());
    }
}
