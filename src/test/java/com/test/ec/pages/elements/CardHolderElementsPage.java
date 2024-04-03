package com.test.ec.pages.elements;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.FindBy;

public class CardHolderElementsPage extends PageObject {
    // Elemento para Login y Validacion
    @FindBy(id = "txtUsuario")
    protected WebElementFacade txt_username;

    // Elemento para Login
    @FindBy(id = "txtClave")
    protected WebElementFacade txt_password;

    // Elemento para Login
    @FindBy(id = "btnIngresar")
    protected WebElementFacade btn_login;

    // Elemento para Logout
    @FindBy(xpath = "//frame[@src='entorno/chlHeader.aspx']")
    protected WebElementFacade frame_header;

    // Elemento para Logout
    @FindBy(xpath = "//a[@href='chlSalir.aspx']")
    protected WebElementFacade btn_cerrarSesion;

    // Elemento para Validacion
    @FindBy(xpath = "//frame[@src='entorno/chlHeader.aspx']")
    protected WebElementFacade lbl_product;

    // Elemento para Validacion
    public boolean isAlertPresent() {
        try {
            getDriver().switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
