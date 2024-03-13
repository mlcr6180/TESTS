package com.test.ec.definitions;

import com.test.ec.steps.login.CardHolderLoginStep;
import com.test.ec.steps.validations.CardHolderValidationStep;
import com.test.ec.utilities.sslCertificate.SSLCertified;
import com.test.ec.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class CardHolderLoginDef {
    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    SSLCertified cSSL;

    @Steps(shared = true)
    CardHolderLoginStep login;

    @Steps(shared = true)
    CardHolderValidationStep validate;

    @Given("El usuario navega al sitio web de Card Holder")
    public void userNavegateTo() {
        url.navegateTo("https://172.20.41.84:8443/CardHolder/entorno/chlLogin.aspx");
        cSSL.certificateSSL();
    }

    @When("Ingresa credenciales correctas de Card Holder")
    public void userLoginWithValidCredentials() {
        login.typeUsername("jamaldon");
        login.typePassword("jmaldon9");
        login.clickLogin();
    }

    @Then("La aplicacion deberia mostrar el modulo principal de Card Holder")
    public void systemShowProductsModule() {
        Assert.assertTrue(validate.titleIsVisible());
    }

    @When("Ingresa credenciales incorrectas de Card Holder")
    public void userLoginWithInvalidCredentials() {
        login.typeUsername("jamaldon");
        login.typePassword("123456");
        login.clickLogin();
    }

    @Then("La aplicacion deberia mostrar un mensaje de error de Card Holder")
    public void systemShowErrorMessage() {
        Assert.assertTrue(validate.errorMessageIsDisplayed());
    }
}
