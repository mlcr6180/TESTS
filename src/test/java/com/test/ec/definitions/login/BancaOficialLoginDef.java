package com.test.ec.definitions.login;

import com.test.ec.steps.login.BancaOficialLoginStep;
import com.test.ec.steps.validations.BancaOficialValidationStep;
import com.test.ec.utilities.sslCertificate.SSLCertified;
import com.test.ec.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class BancaOficialLoginDef {
    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    SSLCertified cSSL;

    @Steps(shared = true)
    BancaOficialLoginStep login;

    @Steps(shared = true)
    BancaOficialValidationStep validate;

    @Given("El usuario navega al sitio web de Banca Oficial")
    public void userNavegateTo() {
        url.navegateTo("http://172.20.41.61/BancaOficialCom/Login.aspx");
    }

    @When("Ingresa credenciales correctas de Banca Oficial")
    public void userLoginWithValidCredentials() {
        login.typeUsername("jamaldon");
        login.typePassword("jmaldon9");
        login.clickLogin();
    }

    @Then("La aplicacion deberia mostrar el modulo principal de Banca Oficial")
    public void systemShowProductsModule() {
        Assert.assertTrue(validate.titleIsVisible());
    }

    @When("Ingresa credenciales incorrectas de Banca Oficial")
    public void userLoginWithInvalidCredentials() {
        login.typeUsername("jamaldon");
        login.typePassword("123456");
        login.clickLogin();
    }

    @Then("La aplicacion deberia mostrar un mensaje de error de Banca Oficial")
    public void systemShowErrorMessage() {
        Assert.assertTrue(validate.errorMessageIsDisplayed());
    }
}
