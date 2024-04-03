package com.test.ec.pages.elements;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class BIZAGIElementsPage extends PageObject {
    // Elemento para Login y Validacion
    @FindBy(xpath = "//input[@class='input-field']")
    protected WebElementFacade txt_username;

    // Elemento para Login
    @FindBy(xpath = "//input[@class='input-field input-field--icon_right']")
    protected WebElementFacade txt_password;

    // Elemento para Login
    @FindBy(xpath = "//button[@class='button button-primary']")
    protected WebElementFacade btn_login;

    // Elemento para Logout
    @FindBy(xpath = "//i[contains(@class,'adm-user bz-icon')]")
    protected WebElementFacade btn_CerrarSesion;

    // Elemento para Logout
    @FindBy(xpath = "//li[@id='logout']")
    protected WebElementFacade btn_Salir;

    // Elemento para Validacion
    @FindBy(xpath = "//i[contains(@class,'adm-user bz-icon bz-icon-16 bz-icon-cog-outline')]")
    protected WebElementFacade lbl_product;

    // Elemento para Validacion
    @FindBy(xpath = "//p[@class='secondary-data']")
    protected WebElementFacade lbl_errorMessage;
}
