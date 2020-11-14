package co.com.hospital.certificacion.autoHospital.tasks;

import co.com.hospital.certificacion.autoHospital.model.DatosDoctor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static co.com.hospital.certificacion.autoHospital.userInterface.AgregarDoctor.*;

import java.util.List;

public class RegistrarDoctor implements Task {

    List <DatosDoctor> datos;

    public RegistrarDoctor(List<DatosDoctor> datos) {
        this.datos = datos;
    }//Con este constructor tendremos acceso a los datos traidos desde
    //la clase DatosDoctor que se encuentran en privado

    @Override
    public <T extends Actor> void performAs(T actor) {
        theActorInTheSpotlight().attemptsTo(
                Enter.theValue(datos.get(0).getNombre()).into(TXT_NOMBRE),
                Enter.theValue(datos.get(0).getApellido()).into(TXT_APELLIDO),
                Enter.theValue(datos.get(0).getTelefono()).into(TXT_TELEFONO),
                Click.on(CB_TIPO_IDENTIFICACION),
                Click.on(CB_CEDULA),
                Enter.theValue(datos.get(0).getDocumentoID()).into(TXT_NUMERO_DOCUMENTO),
                Click.on(BTN_GUARDAR));
    }

    public static RegistrarDoctor enLaPagina(List<DatosDoctor> datos){
        return Tasks.instrumented(RegistrarDoctor.class, datos);
    }
}
