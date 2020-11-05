package co.com.hospital.certificacion.autoHospital.stepDefinitions;

import co.com.hospital.certificacion.autoHospital.model.DatosDoctor;
import co.com.hospital.certificacion.autoHospital.questions.VerificarRegistro;
import co.com.hospital.certificacion.autoHospital.runners.RegistroDoctor;
import co.com.hospital.certificacion.autoHospital.tasks.AbrirPagina;
import co.com.hospital.certificacion.autoHospital.tasks.RegistrarDoctor;
import co.com.hospital.certificacion.autoHospital.tasks.SeleccionarAgregarDoctor;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RegistroDoctorStepDefinition {

    @Before
    public void configuracionInicial(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Christian");
    }

    @Given("^que Christian esta en la pagina del hospital$")
    public void queChristianEstaEnLaPaginaDelHospital() {
        OnStage.theActorInTheSpotlight().wasAbleTo(AbrirPagina.enElNavegador());
    }


    @When("^el intenta registrar el doctor$")
    public void elIntentaRegistrarElDoctor(List <DatosDoctor> datos )  {
        theActorInTheSpotlight().attemptsTo(SeleccionarAgregarDoctor.enElSistemaDelHospital());
        theActorInTheSpotlight().attemptsTo(RegistrarDoctor.enLaPagina(datos));
    }

    @Then("^el vera el mensaje (.*)$")
    public void elVeraElMensajeDatosGuardadosCorrectamente(String ElMensajeEsperado) {
        theActorInTheSpotlight().should(seeThat(VerificarRegistro.delSistemaHospital(ElMensajeEsperado)));
    }

}
