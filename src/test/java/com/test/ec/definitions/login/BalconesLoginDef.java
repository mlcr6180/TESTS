package com.test.ec.definitions.login;

import com.test.ec.steps.login.BalconesLoginStep;
import com.test.ec.steps.logout.BalconesLogoutStep;
import com.test.ec.steps.validations.BalconesValidationStep;
import com.test.ec.utilities.credenciales.CredencialesCorrectas;
import com.test.ec.utilities.credenciales.CredencialesIncorrectas;
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

    @Steps(shared = true)
    BalconesLogoutStep logout;

    String username = "jmeras";

    @Given("El usuario navega al sitio web de Balcones")
    public void userNavegateTo() {
        url.navegateTo("https://172.20.41.85:8443/WEBPichinchaCom/BalconesCom/Entorno/Login.aspx");
        cSSL.certificateSSL();
    }

    @When("Ingresa credenciales correctas de Balcones")
    public void userLoginWithValidCredentials() {
        String password = CredencialesCorrectas.obtenerContrasenaCorrectaParaUsuario(username, 0);
        login(username, password);
    }

    @Then("La aplicacion deberia mostrar el modulo principal de Balcones")
    public void systemShowProductsModule() {
        Assert.assertTrue(validate.titleIsVisible());
    }

    @When("El usuario cierra sesion de Balcones")
    public void userLogout() {
        logout.selectFrameHeader();
        logout.clickCerrarSesion();
    }

    @Then("Se muestra la pantalla de iniciar sesion de Balcones")
    public void systemShowLogin() {
        Assert.assertTrue(validate.txt_usernameIsVisible());
    }

    @When("Ingresa credenciales incorrectas de Balcones")
    public void userLoginWithInvalidCredentials() {
        String password = CredencialesIncorrectas.obtenerContrasenaIncorrectaParaUsuario(username);
        login(username, password);
    }

    @Then("La aplicacion deberia mostrar un mensaje de error de Balcones")
    public void systemShowErrorMessage() {
        Assert.assertTrue(validate.errorMessageIsDisplayed());
    }

    private void login(String username, String password) {
        login.typeUsername(username);
        login.typePassword(password);
        login.clickLogin();
    }
}
