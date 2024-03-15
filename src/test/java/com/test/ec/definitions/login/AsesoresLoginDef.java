package com.test.ec.definitions.login;

import com.test.ec.steps.login.AsesoresLoginStep;
import com.test.ec.steps.logout.AsesoresLogoutStep;
import com.test.ec.steps.validations.AsesoresValidationStep;
import com.test.ec.utilities.credenciales.CredencialesCorrectas;
import com.test.ec.utilities.credenciales.CredencialesIncorrectas;
import com.test.ec.utilities.sslCertificate.SSLCertified;
import com.test.ec.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class AsesoresLoginDef {
    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    SSLCertified cSSL;

    @Steps(shared = true)
    AsesoresLoginStep login;

    @Steps(shared = true)
    AsesoresValidationStep validate;

    @Steps(shared = true)
    AsesoresLogoutStep logout;

    String username = "jmeras";

    @Given("El usuario navega al sitio web de Asesores")
    public void userNavegateTo() {
        url.navegateTo("https://172.20.41.84:8443/WEBPichinchaCom/AsesoresCom/Entorno/Login.aspx");
        cSSL.certificateSSL();
    }

    @When("Ingresa credenciales correctas de Asesores")
    public void userLoginWithValidCredentials() {
        String password = CredencialesCorrectas.obtenerContrasenaCorrectaParaUsuario(username, 0);
        login(username, password);
    }

    @Then("La aplicacion deberia mostrar el modulo principal de Asesores")
    public void systemShowProductsModule() {
        Assert.assertTrue(validate.titleIsVisible());
    }

    @When("El usuario cierra sesion de Asesores")
    public void userLogout() {
        logout.seleccionarFrameHeader();
        logout.clickCerrarSesion();
    }

    @Then("Se muestra la pantalla de iniciar sesion de Asesores")
    public void systemShowLogin() {
        Assert.assertTrue(validate.txt_usernameIsVisible());
    }

    @When("Ingresa credenciales incorrectas de Asesores")
    public void userLoginWithInvalidCredentials() {
        String password = CredencialesIncorrectas.obtenerContrasenaIncorrectaParaUsuario(username);
        login(username, password);
    }

    @Then("La aplicacion deberia mostrar un mensaje de error de Asesores")
    public void systemShowErrorMessage() {
        Assert.assertTrue(validate.errorMessageIsDisplayed());
    }

    private void login(String username, String password) {
        login.typeUsername(username);
        login.typePassword(password);
        login.clickLogin();
    }
}
