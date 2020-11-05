package co.com.hospital.certificacion.autoHospital.tasks;

import co.com.hospital.certificacion.autoHospital.userInterface.UrlPaginaInicial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task {

    UrlPaginaInicial urlPaginaInicial;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Open.browserOn(urlPaginaInicial));
    }

    public static AbrirPagina enElNavegador(){
        return Tasks.instrumented(AbrirPagina.class);
    }
}
