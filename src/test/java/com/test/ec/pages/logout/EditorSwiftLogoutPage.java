package com.test.ec.pages.logout;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class EditorSwiftLogoutPage extends PageObject {
    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    protected WebElementFacade btn_logout;

    @FindBy(id = "ctl00_btnSalir")
    protected WebElementFacade btn_salir;
}
