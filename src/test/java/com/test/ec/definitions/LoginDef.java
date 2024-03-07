package com.test.ec.definitions;

import com.test.ec.steps.login.LoginStep;
import com.test.ec.steps.validations.ValidationStep;
import com.test.ec.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class LoginDef {
    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    LoginStep login;

    @Steps(shared = true)
    ValidationStep validate;

    @Given("El usuario navega al sitio web")
    public void userNavigateTo() {
        url.navegateTo("https://www.saucedemo.com/v1/index.html");
    }

    @When("Ingresa credenciales validas")
    public void userLoginWithValidCredentials() {
        login.typeUsername("standard_user");
        login.typePassword("secret_sauce");
        login.clickLogin();
    }

    @Then("La aplicacion deberia mostrar el modulo principal de productos")
    public void systemShowProductsModule() {
        Assert.assertTrue(validate.titleIsVisible());
    }

    @When("Ingresa credenciales invalidas")
    public void userLoginWithInvalidCredentials() {
        login.typeUsername("standard_user");
        login.typePassword("123456");
        login.clickLogin();
    }

    @Then("La aplicacion deberia mostrar un mensaje de error")
    public void systemShowErrorMessage() {
        Assert.assertTrue(validate.errorMessageIsDisplayed());
    }
}
