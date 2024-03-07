package com.test.ec.utilities.website;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.thucydides.core.pages.PageObject;

public class WebSite {

    @Steps(shared = true)
    PageObject swag;

    @Step("Navegar al ")
    public void navegateTo(String url) {
        swag.setDefaultBaseUrl(url);
        swag.open();
    }
}
