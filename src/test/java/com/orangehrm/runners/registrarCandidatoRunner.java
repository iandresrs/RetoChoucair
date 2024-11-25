package com.orangehrm.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = "pretty",
        features = "src/test/resources/features/registrarCandidato.feature",
        glue = "com.orangehrm.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@RegistrarCandidato"
)
public class registrarCandidatoRunner {
}
