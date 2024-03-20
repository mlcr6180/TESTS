package com.test.ec.definitions.login;

import com.test.ec.steps.login.CapturaRemotaLoginStep;
import com.test.ec.steps.logout.CapturaRemotaLogoutStep;
import com.test.ec.steps.validations.CapturaRemotaValidationStep;
import com.test.ec.utilities.credenciales.CredencialesCorrectas;
import com.test.ec.utilities.credenciales.CredencialesIncorrectas;
import com.test.ec.utilities.sslCertificate.SSLCertified;
import com.test.ec.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class CapturaRemotaLoginDef {
    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    SSLCertified cSSL;

    @Steps(shared = true)
    CapturaRemotaLoginStep login;

    @Steps(shared = true)
    CapturaRemotaValidationStep validate;

    @Steps(shared = true)
    CapturaRemotaLogoutStep logout;

    String username = "MASGAS1";

    @Given("El usuario navega al sitio web de Captura Remota")
    public void userNavegateTo() {
        url.navegateTo("https://172.20.41.97:8043/CRC/");
        cSSL.certificateSSL();
    }

    @When("Ingresa credenciales correctas de Captura Remota")
    public void userLoginWithValidCredentials() {
        String password = CredencialesCorrectas.obtenerContrasenaCorrectaParaUsuario(username, 0);
        login(username, password);
    }

    @Then("La aplicacion deberia mostrar el modulo principal de Captura Remota")
    public void systemShowProductsModule() {
        Assert.assertTrue(validate.titleIsVisible());
    }

    @When("El usuario cierra sesion de Captura Remota")
    public void userLogout() {
        logout.clickCerrarSesion();
    }

    @Then("Se muestra la pantalla de iniciar sesion de Captura Remota")
    public void systemShowLogin() {
        Assert.assertTrue(validate.txt_usernameIsVisible());
    }

    @When("Ingresa credenciales incorrectas de Captura Remota")
    public void userLoginWithInvalidCredentials() {
        String password = CredencialesIncorrectas.obtenerContrasenaIncorrectaParaUsuario(username);
        login(username, password);
    }

    @Then("La aplicacion deberia mostrar un mensaje de error de Captura Remota")
    public void systemShowErrorMessage() {
        Assert.assertTrue(validate.errorMessageIsDisplayed());
    }

    private void login(String username, String password) {
        login.typeUsername(username);
        login.typePassword(password);
        login.clickLogin();
    }
}
