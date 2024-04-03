package com.test.ec.pages.elements;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.FindBy;

public class ContabilidadElementsPage extends PageObject {
    // Elemento para Login y Validacion
    @FindBy(id = "TBUsuario")
    protected WebElementFacade txt_username;

    // Elemento para Login
    @FindBy(id = "TBClave")
    protected WebElementFacade txt_password;

    // Elemento para Login
    @FindBy(id = "BIngresar")
    protected WebElementFacade btn_login;

    // Elemento para Logout
    @FindBy(xpath = "//frame[@src='MenuContabilidad.aspx']")
    protected WebElementFacade frame_menuContabilidad;

    // Elemento para Logout
    @FindBy(xpath = "//a[contains(@href, '#') and contains(text(), 'Salir')]")
    protected WebElementFacade btn_cerrarSesion;

    // Elemento para Logout
    @FindBy(xpath = "//a[contains(@href, '/WebPichinchaCom/ContabilidadCom/Entorno/Login.aspx') and contains(text(), 'Salir de Contabilidad')]")
    protected WebElementFacade btn_Salir;

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
