package com.test.ec.pages.elements;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class EstructurasControlElementsPage extends PageObject {
    // Elemento para Login y Validacion
    @FindBy(id = "txtUsuario")
    protected WebElementFacade txt_username;

    // Elemento para Login
    @FindBy(id = "txtClaveUsuario")
    protected WebElementFacade txt_password;

    // Elemento para Login
    @FindBy(id = "cmdAceptar")
    protected WebElementFacade btn_login;

    // Elemento para Logout
    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    protected WebElementFacade btn_logout;

    // Elemento para Logout
    @FindBy(id = "ctl00_btnSalir")
    protected WebElementFacade btn_salir;

    // Elemento para Validacion
    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    protected WebElementFacade lbl_product;

    // Elemento para Validacion
    @FindBy(xpath = "//li[contains(@class, 'text-black') and contains(text(), 'USUARIO O CLAVE INCORRECTA')]")
    protected WebElementFacade lbl_errorMessage;
}
