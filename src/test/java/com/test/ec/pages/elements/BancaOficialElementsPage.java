package com.test.ec.pages.elements;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class BancaOficialElementsPage extends PageObject {
    // Elemento para Login y Validacion
    @FindBy(id = "txtUsuario")
    protected WebElementFacade txt_username;

    // Elemento para Login
    @FindBy(id = "txtContrasena")
    protected WebElementFacade txt_password;

    // Elemento para Login
    @FindBy(id = "sbmAceptar")
    protected WebElementFacade btn_login;

    // Elemento para Logout
    @FindBy(xpath = "//frame[@src='Entorno/Cabecera.aspx']")
    protected WebElementFacade frame_header;

    // Elemento para Logout
    @FindBy(xpath = "//img[@src='../images/icons/close.gif']")
    protected WebElementFacade btn_cerrarSesion;

    // Elemento para Validacion
    @FindBy(xpath = "//frame[@src='Entorno/Cabecera.aspx']")
    protected WebElementFacade lbl_product;

    // Elemento para Validacion
    @FindBy(xpath = "//span[@id='lblMensaje']")
    protected WebElementFacade lbl_errorMessage;
}
