package com.test.ec.pages.elements;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AdministradorPagosElementsPage extends PageObject {
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
    protected WebElementFacade btn_cerrarSesion;

    // Elemento para Logout
    @FindBy(xpath = "//a[@id='ctl00_btnSalir2']")
    protected WebElementFacade btn_salir;

    // Elemento para Validacion
    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    protected WebElementFacade lbl_product;

    // Elemento para Validacion
    @FindBy(xpath = "//span[contains(@class, 'fa fa-lock')]")
    protected WebElementFacade lbl_errorMessage;
}
