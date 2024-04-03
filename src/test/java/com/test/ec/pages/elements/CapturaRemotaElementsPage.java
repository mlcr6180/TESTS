package com.test.ec.pages.elements;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CapturaRemotaElementsPage extends PageObject {
    // Elemento para Login y Validacion
    @FindBy(id = "ASPxRoundPanel1_ASPxFormLayout1_txtUsuario_I")
    protected WebElementFacade txt_username;

    // Elemento para Login
    @FindBy(id = "ASPxRoundPanel1_ASPxFormLayout1_txtClave_I")
    protected WebElementFacade txt_password;

    // Elemento para Login
    @FindBy(id = "ASPxRoundPanel1_ASPxFormLayout1_cmdIngresar")
    protected WebElementFacade btn_login;

    // Elemento para Logout
    @FindBy(xpath = "//span[@class='dxnb-ghtext']")
    protected WebElementFacade btn_CerrarSesion;

    // Elemento para Validacion
    @FindBy(xpath = "//span[text()='Salir']")
    protected WebElementFacade lbl_product;

    // Elemento para Validacion
    @FindBy(xpath = "//span[text()='Usuario o contraseña inválida.']")
    protected WebElementFacade lbl_errorMessage;
}
