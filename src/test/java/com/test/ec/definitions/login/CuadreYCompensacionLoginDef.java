package com.test.ec.definitions.login;

import com.test.ec.steps.login.CuadreYCompensacionLoginStep;
import com.test.ec.steps.logout.CuadreYCompensacionLogoutStep;
import com.test.ec.steps.validations.CuadreYCompensacionValidationStep;
import com.test.ec.utilities.credenciales.CredencialesCorrectas;
import com.test.ec.utilities.credenciales.CredencialesIncorrectas;
import com.test.ec.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class CuadreYCompensacionLoginDef {
    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    CuadreYCompensacionLoginStep login;

    @Steps(shared = true)
    CuadreYCompensacionValidationStep validate;

    @Steps(shared = true)
    CuadreYCompensacionLogoutStep logout;

    String username = "jmeras";

    @Given("El usuario navega al sitio web de Cuadre y Compensacion")
    public void userNavegateTo() {
        url.navegateTo("http://172.20.41.92:8080/CuadreCompensacionATMs/Login/Login.aspx");
    }

    @When("Ingresa credenciales correctas de Cuadre y Compensacion")
    public void userLoginWithValidCredentials() {
        String password = CredencialesCorrectas.obtenerContrasenaCorrectaParaUsuario(username, 0);
        login(username, password);
    }

    @Then("La aplicacion deberia mostrar el modulo principal de Cuadre y Compensacion")
    public void systemShowProductsModule() {
        Assert.assertTrue(validate.titleIsVisible());
    }

    @When("El usuario cierra sesion de Cuadre y Compensacion")
    public void userLogout() {
        logout.clickCerrarSesion();
        logout.clickSalir();
    }

    @Then("Se muestra la pantalla de iniciar sesion de Cuadre y Compensacion")
    public void systemShowLogin() {
        Assert.assertTrue(validate.txt_usernameIsVisible());
    }

    @When("Ingresa credenciales incorrectas de Cuadre y Compensacion")
    public void userLoginWithInvalidCredentials() {
        String password = CredencialesIncorrectas.obtenerContrasenaIncorrectaParaUsuario(username);
        login(username, password);
    }

    @Then("La aplicacion deberia mostrar un mensaje de error de Cuadre y Compensacion")
    public void systemShowErrorMessage() {
        Assert.assertTrue(validate.errorMessageIsDisplayed());
    }

    private void login(String username, String password) {
        login.typeUsername(username);
        login.typePassword(password);
        login.clickLogin();
    }
}
