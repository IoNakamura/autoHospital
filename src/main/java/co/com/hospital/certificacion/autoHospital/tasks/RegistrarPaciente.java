package co.com.hospital.certificacion.autoHospital.tasks;

import static co.com.hospital.certificacion.autoHospital.userInterface.AgregarPaciente.*;

import co.com.hospital.certificacion.autoHospital.model.DatosPaciente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class RegistrarPaciente implements Task {

    List<DatosPaciente> datos;

    public RegistrarPaciente(List<DatosPaciente> datos) {
        this.datos = datos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Enter.theValue(datos.get(0).getNombre()).into(TXT_NOMBRE),
                Enter.theValue(datos.get(0).getApellido()).into(TXT_APELLIDO),
                Enter.theValue(datos.get(0).getTelefono()).into(TXT_TELEFONO),
                Click.on(CB_PASAPORTE),
                Enter.theValue(datos.get(0).getDocumentoID()).into(TXT_NUMERO_DOCUMENTO));
                Click.on(CHK_SALUD_PREPAGADA);
                Click.on(BTN_GUARDAR_PACIENTE);
    }

    public static RegistrarPaciente enElSistemaHospital(List<DatosPaciente> datos){
        return Tasks.instrumented(RegistrarPaciente.class, datos);
    }
}
