package com.test.ec.definitions.login;

import com.test.ec.steps.login.EstructurasControlLoginStep;
import com.test.ec.steps.logout.EstructurasControlLogoutStep;
import com.test.ec.steps.validations.EstructurasControlValidationStep;
import com.test.ec.utilities.credenciales.CredencialesCorrectas;
import com.test.ec.utilities.credenciales.CredencialesIncorrectas;
import com.test.ec.utilities.sslCertificate.SSLCertified;
import com.test.ec.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class EstructurasControlLoginDef {
    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    SSLCertified cSSL;

    @Steps(shared = true)
    EstructurasControlLoginStep login;

    @Steps(shared = true)
    EstructurasControlValidationStep validate;

    @Steps(shared = true)
    EstructurasControlLogoutStep logout;

    String username = "jmeras";

    @Given("El usuario navega al sitio web de Estructuras Control")
    public void userNavegateTo() {
        url.navegateTo("https://172.20.41.84:8443/EstructurasControlBGR/Login/Login.aspx");
        cSSL.certificateSSL();
    }

    @When("Ingresa credenciales correctas de Estructuras Control")
    public void userLoginWithValidCredentials() {
        String password = CredencialesCorrectas.obtenerContrasenaCorrectaParaUsuario(username, 0);
        login(username, password);
    }

    @Then("La aplicacion deberia mostrar el modulo principal de Estructuras Control")
    public void systemShowProductsModule() {
        Assert.assertTrue(validate.titleIsVisible());
    }

    @When("El usuario cierra sesion de Estructuras Control")
    public void userLogout() {
        logout.clickCerrarSesion();
        logout.clickSalir();
    }

    @Then("Se muestra la pantalla de iniciar sesion de Estructuras Control")
    public void systemShowLogin() {
        Assert.assertTrue(validate.txt_usernameIsVisible());
    }

    @When("Ingresa credenciales incorrectas de Estructuras Control")
    public void userLoginWithInvalidCredentials() {
        String password = CredencialesIncorrectas.obtenerContrasenaIncorrectaParaUsuario(username);
        login(username, password);
    }

    @Then("La aplicacion deberia mostrar un mensaje de error de Estructuras Control")
    public void systemShowErrorMessage() {
        Assert.assertTrue(validate.errorMessageIsDisplayed());
    }

    private void login(String username, String password) {
        login.typeUsername(username);
        login.typePassword(password);
        login.clickLogin();
    }
}
