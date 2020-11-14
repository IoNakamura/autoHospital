package co.com.hospital.certificacion.autoHospital.stepDefinitions;


import co.com.hospital.certificacion.autoHospital.model.DatosPaciente;
import co.com.hospital.certificacion.autoHospital.tasks.RegistrarPaciente;
import co.com.hospital.certificacion.autoHospital.tasks.SeleccionarAgregarPaciente;
import cucumber.api.java.es.Cuando;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class RegistroPacienteStepDefinition {

    @Cuando("^el intenta registrar el paciente$")
    public void elIntentaRegistrarElPaciente(List<DatosPaciente> datos)  {
    OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarAgregarPaciente.enElSistema());
    OnStage.theActorInTheSpotlight().attemptsTo(RegistrarPaciente.enElSistemaHospital(datos));
    }
}
