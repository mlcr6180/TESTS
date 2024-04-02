package com.test.ec.definitions.login;

import com.test.ec.steps.login.BancaOficialLoginStep;
import com.test.ec.steps.logout.BancaOficialLogoutStep;
import com.test.ec.steps.validations.BancaOficialValidationStep;
import com.test.ec.utilities.credenciales.CredencialesCorrectas;
import com.test.ec.utilities.credenciales.CredencialesIncorrectas;
import com.test.ec.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;

public class BancaOficialLoginDef {
    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    BancaOficialLoginStep login;

    @Steps(shared = true)
    BancaOficialValidationStep validate;

    @Steps(shared = true)
    BancaOficialLogoutStep logout;

    String username = "jmeras";

    @Given("El usuario navega al sitio web de Banca Oficial")
    public void userNavegateTo() {
        url.navegateTo("http://172.20.41.61/BancaOficialCom/Login.aspx");
        handleWindowsPopup();
    }

    @When("Ingresa credenciales correctas de Banca Oficial")
    public void userLoginWithValidCredentials() {
        String password = CredencialesCorrectas.obtenerContrasenaCorrectaParaUsuario(username, 0);
        login(username, password);
    }

    @Then("La aplicacion deberia mostrar el modulo principal de Banca Oficial")
    public void systemShowProductsModule() {
        Assert.assertTrue(validate.titleIsVisible());
    }

    @When("El usuario cierra sesion de Banca Oficial")
    public void userLogout() {
        logout.selectFrameHeader();
        logout.clickCerrarSesion();
    }

    @Then("Se muestra la pantalla de iniciar sesion de Banca Oficial")
    public void systemShowLogin() {
        Assert.assertTrue(validate.txt_usernameIsVisible());
    }

    @When("Ingresa credenciales incorrectas de Banca Oficial")
    public void userLoginWithInvalidCredentials() {
        String password = CredencialesIncorrectas.obtenerContrasenaIncorrectaParaUsuario(username);
        login(username, password);
    }

    @Then("La aplicacion deberia mostrar un mensaje de error de Banca Oficial")
    public void systemShowErrorMessage() {
        Assert.assertTrue(validate.errorMessageIsDisplayed());
    }

    private void login(String username, String password) {
        login.typeUsername(username);
        login.typePassword(password);
        login.clickLogin();
    }

    public void handleWindowsPopup() {
        try {
            Robot robot = new Robot();

            Thread.sleep(5000);

            String username = "usuario";
            for (char c : username.toCharArray()) {
                robot.keyPress(Character.toUpperCase(c));
                robot.keyRelease(Character.toUpperCase(c));
                robot.delay(100);
            }

            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            robot.delay(1000);

            String password = "contraseña";
            boolean primerCaracter = true;
            for (char c : password.toCharArray()) {
                if (primerCaracter) {
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(Character.toUpperCase(c));
                    robot.keyRelease(Character.toUpperCase(c));
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    primerCaracter = false;
                } else if (c == '@') {
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD6);
                    robot.keyRelease(KeyEvent.VK_NUMPAD6);
                    robot.keyPress(KeyEvent.VK_NUMPAD4);
                    robot.keyRelease(KeyEvent.VK_NUMPAD4);
                    robot.keyRelease(KeyEvent.VK_ALT);
                } else {
                    robot.keyPress(Character.toUpperCase(c));
                    robot.keyRelease(Character.toUpperCase(c));
                    robot.delay(100);
                }
            }

            Thread.sleep(5000);

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
