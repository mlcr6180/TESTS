package com.test.ec.pages.logout;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CapturaRemotaLogoutPage extends PageObject {
    @FindBy(xpath = "//span[@class='dxnb-ghtext']")
    protected WebElementFacade btn_CerrarSesion;
}
