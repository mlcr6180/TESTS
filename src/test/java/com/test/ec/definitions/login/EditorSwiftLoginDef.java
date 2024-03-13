package com.test.ec.definitions.login;

import com.test.ec.steps.login.EditorSwiftLoginStep;
import com.test.ec.steps.validations.EditorSwiftValidationStep;
import com.test.ec.utilities.sslCertificate.SSLCertified;
import com.test.ec.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class EditorSwiftLoginDef {
    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    SSLCertified cSSL;

    @Steps(shared = true)
    EditorSwiftLoginStep login;

    @Steps(shared = true)
    EditorSwiftValidationStep validate;

    @Given("El usuario navega al sitio web de Editor Swift")
    public void userNavegateTo() {
        url.navegateTo("https://172.20.41.84:8443/EditorSwift/Login/Login.aspx");
        cSSL.certificateSSL();
    }

    @When("Ingresa credenciales correctas de Editor Swift")
    public void userLoginWithValidCredentials() {
        login.typeUsername("jamaldon");
        login.typePassword("jmaldon9");
        login.clickLogin();
    }

    @Then("La aplicacion deberia mostrar el modulo principal de Editor Swift")
    public void systemShowProductsModule() {
        Assert.assertTrue(validate.titleIsVisible());
    }

    @When("Ingresa credenciales incorrectas de Editor Swift")
    public void userLoginWithInvalidCredentials() {
        login.typeUsername("jamaldon");
        login.typePassword("123456");
        login.clickLogin();
    }

    @Then("La aplicacion deberia mostrar un mensaje de error de Editor Swift")
    public void systemShowErrorMessage() {
        Assert.assertTrue(validate.errorMessageIsDisplayed());
    }
}
