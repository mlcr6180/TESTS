package com.test.ec.definitions.login;

import com.test.ec.steps.login.AdministracionBancaDigitalLoginStep;
import com.test.ec.steps.logout.AdministracionBancaDigitalLogoutStep;
import com.test.ec.steps.validations.AdministracionBancaDigitalValidationStep;
import com.test.ec.utilities.credenciales.CredencialesCorrectas;
import com.test.ec.utilities.credenciales.CredencialesIncorrectas;
import com.test.ec.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class AdministracionBancaDigitalLoginDef {
    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    AdministracionBancaDigitalLoginStep login;

    @Steps(shared = true)
    AdministracionBancaDigitalValidationStep validate;

    @Steps(shared = true)
    AdministracionBancaDigitalLogoutStep logout;

    String username = "tcsmonitor";

    @Given("El usuario navega al sitio web de Administracion Banca Digital")
    public void userNavegateTo() {
        url.navegateTo("https://bd-test.bgr.ec/web/guest/adminportalbgr");
    }

    @When("Ingresa credenciales correctas de Administracion Banca Digital")
    public void userLoginWithValidCredentials() {
        String password = CredencialesCorrectas.obtenerContrasenaCorrectaParaUsuario(username, 0);
        login(username, password);
    }

    @Then("La aplicacion deberia mostrar el modulo principal de Administracion Banca Digital")
    public void systemShowProductsModule() {
        Assert.assertTrue(validate.titleIsVisible());
    }

    @When("El usuario cierra sesion de Administracion Banca Digital")
    public void userLogout() {
        logout.clickCentroAdministracionOmnibanca();
        logout.clikAdministracionUsuarios();
        logout.clickCerrarSesion();
        logout.clickSalir();
    }

    @Then("Se muestra la pantalla de iniciar sesion de Administracion Banca Digital")
    public void systemShowLogin() {
        Assert.assertTrue(validate.botonIsVisible());
    }

    @When("Ingresa credenciales incorrectas de Administracion Banca Digital")
    public void userLoginWithInvalidCredentials() {
        String password = CredencialesIncorrectas.obtenerContrasenaIncorrectaParaUsuario(username);
        login(username, password);
    }

    @Then("La aplicacion deberia mostrar un mensaje de error de Administracion Banca Digital")
    public void systemShowErrorMessage() {
        Assert.assertTrue(validate.errorMessageIsDisplayed());
    }

    private void login(String username, String password) {
        login.typeUsername(username);
        login.typePassword(password);
        login.clickLogin();
    }
}
