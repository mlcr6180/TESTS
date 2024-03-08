package com.test.ec.utilities.sslCertificate;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class SSLCertified extends PageObject {
    @FindBy(id = "details-button")
    protected WebElementFacade btn_avanzados;

    @FindBy(id = "proceed-link")
    protected WebElementFacade lnk_continuar;

    @Step("El usuario resuelve problemas con el certificado SSL")
    public void certificateSSL() {
        btn_avanzados.click();
        lnk_continuar.click();
    }
}
