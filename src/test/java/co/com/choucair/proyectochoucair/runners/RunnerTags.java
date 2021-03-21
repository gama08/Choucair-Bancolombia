package co.com.choucair.proyectochoucair.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/academy-choucair.feature",
        tags = "@historia",
        glue = "co.com.choucair.proyectochoucair.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class RunnerTags {
}
