package com.reliquias.software.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/compra_exitosa.feature",
        glue = "com.reliquias.software.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {
                "pretty",
                "json:target/serenity-reports/web_applications/login/cucumber.json",
                "html:target/serenity-reports/web_applications/login/serenity-html-report.html",
                "rerun:target/serenity-reports/web_applications/login/rerun.txt"
        }
)
public class CompraExitosaRunner {
}