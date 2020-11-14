package co.com.hospital.certificacion.autoHospital.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.hospital.certificacion.autoHospital.userInterface.PaginaInicial.BTN_AGREGAR_DOCTOR;

public class SeleccionarAgregarDoctor implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_AGREGAR_DOCTOR));
    }

    public static SeleccionarAgregarDoctor enElSistemaDelHospital(){
        return Tasks.instrumented(SeleccionarAgregarDoctor.class);
    }
}
