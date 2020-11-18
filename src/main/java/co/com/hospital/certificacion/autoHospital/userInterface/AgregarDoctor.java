package co.com.hospital.certificacion.autoHospital.userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AgregarDoctor extends PageObject {

    public static final Target TXT_NOMBRE =
        Target.the("Ingrese el nombre").located(By.id("name"));

    public static final Target TXT_APELLIDO =
        Target.the("Ingrese el apellido").located(By.id("last_name"));

    public static final Target TXT_TELEFONO =
        Target.the("Ingrese el telefono").located(By.id("telephone"));

    public static final Target CB_TIPO_IDENTIFICACION =
        Target.the("Combo box tipo de Cedula de cuidadania").located(By.id("identification_type"));

    public static final Target CB_CEDULA =
        Target.the("Tipo Cedula de ciudadania").located(By.xpath("//*[@id=\"identification_type\"]/option[1]"));

    public static final Target TXT_NUMERO_DOCUMENTO =
        Target.the("Numero de documento de identidad").located(By.id("identification"));

    public static final Target BTN_GUARDAR =
        Target.the("Boton guardar datos").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/a"));


}
