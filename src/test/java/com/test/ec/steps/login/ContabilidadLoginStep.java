package com.test.ec.steps.login;

import com.test.ec.pages.login.ContabilidadLoginPage;
import net.serenitybdd.annotations.Step;

public class ContabilidadLoginStep extends ContabilidadLoginPage {
    @Step("Ingresar usuario")
    public void typeUsername(String username) {
        txt_username.sendKeys(username);
    }

    @Step("Ingresar contraseña")
    public void typePassword(String password) {
        txt_password.sendKeys(password);
    }

    @Step("Click en el boton login")
    public void clickLogin() {
        btn_login.click();
    }
}
