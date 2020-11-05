package co.com.hospital.certificacion.autoHospital.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/registro_doctor.feature"},
        glue = {"co.com.hospital.certificacion.autoHospital.stepDefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class RegistroDoctor {
}
