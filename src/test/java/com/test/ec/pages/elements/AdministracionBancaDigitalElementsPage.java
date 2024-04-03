package com.test.ec.pages.elements;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AdministracionBancaDigitalElementsPage extends PageObject {
    // Elemento para Login
    @FindBy(id = "_com_liferay_login_web_portlet_LoginPortlet_login")
    protected WebElementFacade txt_username;

    // Elemento para Login
    @FindBy(id = "_com_liferay_login_web_portlet_LoginPortlet_password")
    protected WebElementFacade txt_password;

    // Elemento para Login
    @FindBy(xpath = "//button[@type='submit']")
    protected WebElementFacade btn_login;

    // Elemento para Logout
    @FindBy(xpath = "(//a[normalize-space()='Centro de Administración Omnibanca'])[1]")
    protected WebElementFacade lbl_centroAministracionOmnibanca;

    // Elemento para Logout
    @FindBy(id = "_com_liferay_product_navigation_product_menu_web_portlet_ProductMenuPortlet_portlet_com_omnibanca_portal_user_manager_web_ObpManagerUserPortlet")
    protected WebElementFacade lbl_administacionUsuarios;

    // Elemento para Logout
    @FindBy(xpath= "//span[@class='user-avatar-link']")
    protected WebElementFacade btn_cerrarSesion;

    // Elemento para Logout
    @FindBy(xpath = "//a[@href=\"/c/portal/logout\"]")
    protected WebElementFacade btn_salir;

    // Elemento para Validacion
    @FindBy(xpath = "//a[@aria-label='Menú']")
    protected WebElementFacade lbl_product;

    // Elemento para Validacion
    @FindBy(xpath = "//button[@type='submit']")
    protected WebElementFacade lbl_errorMessage;

    // Elemento para Validacion
    @FindBy(xpath = "//button[@class='btn btn-primary ob-primary btn-block']")
    protected WebElementFacade btn_iniciarSesion;
}
