package com.test.ec.steps.login;

import com.test.ec.pages.login.BIZAGILoginPage;
import net.serenitybdd.annotations.Step;

public class BIZAGILoginStep extends BIZAGILoginPage {
    @Step("Ingresar usuario")
    public void typeUsername(String username) {
        txt_username.waitUntilVisible().type(username);
    }

    @Step("Ingresar contraseña")
    public void typePassword(String password) {
        txt_password.waitUntilVisible().type(password);
    }

    @Step("Click en el boton login")
    public void clickLogin() {
        btn_login.waitUntilClickable().click();
    }
}
