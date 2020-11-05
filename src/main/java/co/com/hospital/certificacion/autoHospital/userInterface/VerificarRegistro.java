package co.com.hospital.certificacion.autoHospital.userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class VerificarRegistro extends PageObject {
    public static final Target VALIDATE_REGISTRO =
        Target.the("Validar texto").located(By.cssSelector("div p"));
}
