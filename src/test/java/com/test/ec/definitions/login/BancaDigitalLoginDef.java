package com.test.ec.definitions.login;

import com.test.ec.steps.login.BancaDigitalLoginStep;
import com.test.ec.steps.logout.BancaDigitalLogoutStep;
import com.test.ec.steps.validations.BancaDigitalValidationStep;
import com.test.ec.utilities.credenciales.CredencialesCorrectas;
import com.test.ec.utilities.credenciales.CredencialesIncorrectas;
import com.test.ec.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class BancaDigitalLoginDef {
    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    BancaDigitalLoginStep login;

    @Steps(shared = true)
    BancaDigitalValidationStep validate;

    @Steps(shared = true)
    BancaDigitalLogoutStep logout;

    String username = "jahaira2000";

    @Given("El usuario navega al sitio web de Banca Digital")
    public void userNavigateTo() {
        url.navegateTo("https://bd-test.bgr.ec/");
    }

    @When("Ingresa credenciales correctas de Banca Digital")
    public void userLoginWithValidCredentials() {
        String password = CredencialesCorrectas.obtenerContrasenaCorrectaParaUsuario(username, 0);
        login(username, password);
    }

    @Then("La aplicacion deberia mostrar el modulo principal de Banca Digital")
    public void systemShowProductsModule() {
        Assert.assertTrue(validate.titleIsVisible());
    }

    @When("El usuario cierra sesion de Banca Digital")
    public void userLogout() {
        logout.clickCerrarSesion();
    }

    @Then("Se muestra la pantalla de iniciar sesion de Banca Digital")
    public void systemShowLogin() {
        Assert.assertTrue(validate.botonIsVisible());
    }

    @When("Ingresa credenciales incorrectas de Banca Digital")
    public void userLoginWithInvalidCredentials() {
        String password = CredencialesIncorrectas.obtenerContrasenaIncorrectaParaUsuario(username);
        login(username, password);
    }

    @Then("La aplicacion deberia mostrar un mensaje de error de Banca Digital")
    public void systemShowErrorMessage() {
        Assert.assertTrue(validate.errorMessageIsDisplayed());
    }

    private void login(String username, String password) {
        login.typeUsername(username);
        login.typePassword(password);
        login.clickLogin();
    }
}
