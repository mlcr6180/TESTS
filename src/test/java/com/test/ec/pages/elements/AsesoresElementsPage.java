package com.test.ec.pages.elements;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.FindBy;

public class AsesoresElementsPage extends PageObject {
    // Elemento para Login y Validacion
    @FindBy(id = "Login1_TBUsuario")
    protected WebElementFacade txt_username;

    // Elemento para Login
    @FindBy(id = "Login1_TBClave")
    protected WebElementFacade txt_password;

    // Elemento para Login
    @FindBy(id = "Login1_BIngresar")
    protected WebElementFacade btn_login;

    // Elemento para Logout
    @FindBy(xpath = "//frame[@src='header.aspx']")
    protected WebElementFacade frame_header;

    // Elemento para Logout
    @FindBy(xpath = "//a[@href='Login.aspx']")
    protected WebElementFacade btn_cerrarSesion;

    // Elemento para Validacion
    @FindBy(xpath = "//frame[@src='header.aspx']")
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
