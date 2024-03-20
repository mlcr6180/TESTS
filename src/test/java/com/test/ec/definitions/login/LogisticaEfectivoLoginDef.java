package com.test.ec.definitions.login;

import com.test.ec.steps.login.LogisticaEfectivoLoginStep;
import com.test.ec.steps.logout.LogisticaEfectivoLogoutStep;
import com.test.ec.steps.validations.LogisticaEfectivoValidationStep;
import com.test.ec.utilities.credenciales.CredencialesCorrectas;
import com.test.ec.utilities.credenciales.CredencialesIncorrectas;
import com.test.ec.utilities.sslCertificate.SSLCertified;
import com.test.ec.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class LogisticaEfectivoLoginDef {
    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    SSLCertified cSSL;

    @Steps(shared = true)
    LogisticaEfectivoLoginStep login;

    @Steps(shared = true)
    LogisticaEfectivoValidationStep validate;

    @Steps(shared = true)
    LogisticaEfectivoLogoutStep logout;

    String username = "jmeras";

    @Given("El usuario navega al sitio web de Logistica Efectivo")
    public void userNavegateTo() {
        url.navegateTo("https://172.20.41.84:8443/LogisticaEfectivoBGR/Login/Login.aspx");
        cSSL.certificateSSL();
    }

    @When("Ingresa credenciales correctas de Logistica Efectivo")
    public void userLoginWithValidCredentials() {
        String password = CredencialesCorrectas.obtenerContrasenaCorrectaParaUsuario(username, 0);
        login(username, password);
    }

    @Then("La aplicacion deberia mostrar el modulo principal de Logistica Efectivo")
    public void systemShowProductsModule() {
        Assert.assertTrue(validate.titleIsVisible());
    }

    @When("El usuario cierra sesion de Logistica Efectivo")
    public void userLogout() {
        logout.clickCerrarSesion();
        logout.clickSalir();
    }

    @Then("Se muestra la pantalla de iniciar sesion de Logistica Efectivo")
    public void systemShowLogin() {
        Assert.assertTrue(validate.txt_usernameIsVisible());
    }

    @When("Ingresa credenciales incorrectas de Logistica Efectivo")
    public void userLoginWithInvalidCredentials() {
        String password = CredencialesIncorrectas.obtenerContrasenaIncorrectaParaUsuario(username);
        login(username, password);
    }

    @Then("La aplicacion deberia mostrar un mensaje de error de Logistica Efectivo")
    public void systemShowErrorMessage() {
        Assert.assertTrue(validate.errorMessageIsDisplayed());
    }

    private void login(String username, String password) {
        login.typeUsername(username);
        login.typePassword(password);
        login.clickLogin();
    }
}
