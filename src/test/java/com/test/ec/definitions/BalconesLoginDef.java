package com.test.ec.definitions;

import com.test.ec.steps.login.BalconesLoginStep;
import com.test.ec.steps.validations.BalconesValidationStep;
import com.test.ec.utilities.sslCertificate.SSLCertified;
import com.test.ec.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class BalconesLoginDef {
    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    SSLCertified cSSL;

    @Steps(shared = true)
    BalconesLoginStep login;

    @Steps(shared = true)
    BalconesValidationStep validate;

    @Given("El usuario navega al sitio web de Balcones")
    public void userNavegateTo() {
        url.navegateTo("https://172.20.41.85:8042/WEBPichinchaCom/BalconesCom/Entorno/Escritorio.aspx");
        cSSL.certificateSSL();
    }

    @When("Ingresa credenciales correctas de Balcones")
    public void userLoginWithValidCredentials() {
        login.typeUsername("jamaldon");
        login.typePassword("jmaldon9");
        login.clickLogin();
    }

    @Then("La aplicacion deberia mostrar el modulo principal de Balcones")
    public void systemShowProductsModule() {
        Assert.assertTrue(validate.titleIsVisible());
    }

    @When("Ingresa credenciales incorrectas de Balcones")
    public void userLoginWithInvalidCredentials() {
        login.typeUsername("jamaldon");
        login.typePassword("123456");
        login.clickLogin();
    }

    @Then("La aplicacion deberia mostrar un mensaje de error de Balcones")
    public void systemShowErrorMessage() {
        Assert.assertTrue(validate.errorMessageIsDisplayed());
    }
}
