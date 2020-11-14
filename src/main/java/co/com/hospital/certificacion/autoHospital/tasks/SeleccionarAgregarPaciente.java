package co.com.hospital.certificacion.autoHospital.tasks;

import static co.com.hospital.certificacion.autoHospital.userInterface.PaginaInicial.BTN_AGREGAR_PACIENTE;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarAgregarPaciente implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_AGREGAR_PACIENTE));
    }

    public static SeleccionarAgregarPaciente enElSistema(){
        return Tasks.instrumented(SeleccionarAgregarPaciente.class);
    }
}
