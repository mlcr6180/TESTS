package com.test.ec.pages.elements;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.FindBy;

public class BalconesElementsPage extends PageObject {
    // Elemento para Login y Validacion
    @FindBy(id = "Login2_TBUsuario")
    protected WebElementFacade txt_username;

    // Elemento para Login
    @FindBy(id = "Login2_TBClave")
    protected WebElementFacade txt_password;

    // Elemento para Login
    @FindBy(id = "Login2_BIngresar")
    protected WebElementFacade btn_login;

    // Elemento para Logout
    @FindBy(xpath = "//frame[@src='EscritorioCabecera.aspx']")
    protected WebElementFacade frame_header;

    // Elemento para Logout
    @FindBy(xpath = "//a[@href=\"Login.aspx\"]")
    protected WebElementFacade btn_cerrarSesion;

    // Elemento para Validacion
    @FindBy(xpath = "//frame[@src='EscritorioCabecera.aspx']")
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
