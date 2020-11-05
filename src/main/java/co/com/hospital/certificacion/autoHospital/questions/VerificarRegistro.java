package co.com.hospital.certificacion.autoHospital.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.hospital.certificacion.autoHospital.userInterface.VerificarRegistro.VALIDATE_REGISTRO;

public class VerificarRegistro implements Question<Boolean> {

    private String ElMensajeEsperado;

    public VerificarRegistro(String elMensajeEsperado) {
        ElMensajeEsperado = elMensajeEsperado;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Visibility.of(VALIDATE_REGISTRO).viewedBy(actor);
        String txtWeb = VALIDATE_REGISTRO.resolveFor(actor).getText();
        return txtWeb.contains(ElMensajeEsperado);
    }

    public static VerificarRegistro delSistemaHospital(String txtWeb){
        return new VerificarRegistro(txtWeb);
    }
}
