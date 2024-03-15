package com.test.ec.pages.logout;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AdministracionBancaDigitalLogoutPage extends PageObject {
    @FindBy(xpath = "(//a[normalize-space()='Centro de Administración Omnibanca'])[1]")
    protected WebElementFacade lbl_centroAministracionOmnibanca;

    @FindBy(id = "_com_liferay_product_navigation_product_menu_web_portlet_ProductMenuPortlet_portlet_com_omnibanca_portal_user_manager_web_ObpManagerUserPortlet")
    protected WebElementFacade lbl_administacionUsuarios;

    @FindBy(xpath= "//span[@class='user-avatar-link']")
    protected WebElementFacade btn_cerrarSesion;

    @FindBy(xpath = "//a[@href=\"/c/portal/logout\"]")
    protected WebElementFacade btn_salir;
}
