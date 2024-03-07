package com.test.ec.utilities.website;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.thucydides.core.pages.PageObject;

public class WebSite {

    @Steps(shared = true)
    PageObject page;

    @Step("Navegar al sitio web")
    public void navegateTo(String url) {
        page.setDefaultBaseUrl(url);
        page.open();
    }
}
