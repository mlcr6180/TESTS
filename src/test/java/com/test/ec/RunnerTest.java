package com.test.ec;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.test.ec.definitions",
        tags = "@LoginAdministradorPagos and @IncorrectCredentials"
)
public class RunnerTest {
}
