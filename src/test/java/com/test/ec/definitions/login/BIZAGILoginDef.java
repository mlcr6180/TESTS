package com.test.ec.definitions.login;

import com.test.ec.steps.login.BIZAGILoginStep;
import com.test.ec.steps.logout.BIZAGILogoutStep;
import com.test.ec.steps.validations.BIZAGIValidationStep;
import com.test.ec.utilities.credenciales.CredencialesCorrectas;
import com.test.ec.utilities.credenciales.CredencialesIncorrectas;
import com.test.ec.utilities.sslCertificate.SSLCertified;
import com.test.ec.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class BIZAGILoginDef {
    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    SSLCertified cSSL;

    @Steps(shared = true)
    BIZAGILoginStep login;

    @Steps(shared = true)
    BIZAGIValidationStep validate;

    @Steps(shared = true)
    BIZAGILogoutStep logout;

    String username = "jamaldon";

    @Given("El usuario navega al sitio web de BIZAGI")
    public void userNavegateTo() {
        url.navegateTo("https://172.20.41.101:4433/BPMBGRT/");
        cSSL.certificateSSL();
    }

    @When("Ingresa credenciales correctas de BIZAGI")
    public void userLoginWithValidCredentials() {
        String password = CredencialesCorrectas.obtenerContrasenaCorrectaParaUsuario(username, 1);
        login(username, password);
    }

    @Then("La aplicacion deberia mostrar el modulo principal de BIZAGI")
    public void systemShowProductsModule() {
        Assert.assertTrue(validate.titleIsVisible());
    }

    @When("El usuario cierra sesion de BIZAGI")
    public void userLogout() {
        logout.clickCerrarSesion();
        logout.clickSalir();
    }

    @Then("Se muestra la pantalla de iniciar sesion de BIZAGI")
    public void systemShowLogin() {
        Assert.assertTrue(validate.txt_usernameIsVisible());
    }

    @When("Ingresa credenciales incorrectas de BIZAGI")
    public void userLoginWithInvalidCredentials() {
        String password = CredencialesIncorrectas.obtenerContrasenaIncorrectaParaUsuario(username);
        login(username, password);
    }

    @Then("La aplicacion deberia mostrar un mensaje de error de BIZAGI")
    public void systemShowErrorMessage() {
        Assert.assertTrue(validate.errorMessageIsDisplayed());
    }

    private void login(String username, String password) {
        login.typeUsername(username);
        login.typePassword(password);
        login.clickLogin();
    }
}
