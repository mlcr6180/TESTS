package com.test.ec.pages.elements;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class BancaDigitalElementsPage extends PageObject {
    // Elemento para Login
    @FindBy(name = "username")
    protected WebElementFacade txt_username;

    // Elemento para Login
    @FindBy(name = "password")
    protected WebElementFacade txt_password;

    // Elemento para Login
    @FindBy(xpath = "//*[@id=\"ob-login-content\"]/authentication/section[1]/form/div/div/div/div/div[7]/div/button")
    protected WebElementFacade btn_login;

    // Elemento para Logout
    @FindBy(xpath = "//a[contains(@class,'bottom nav-link')]//span[1]")
    protected WebElementFacade btn_CerrarSesion;

    // Elemento para Validacion
    @FindBy(xpath = "//div[@class='sidebar-portlet']")
    protected WebElementFacade lbl_product;

    // Elemento para Validacion
    @FindBy(xpath = "//span[@class='alert-text']")
    protected WebElementFacade lbl_errorMessage;

    // Elemento para Validacion
    @FindBy(xpath = "//button[@class='btn btn-primary ob-primary btn-block']")
    protected WebElementFacade btn_iniciarSesion;
}
