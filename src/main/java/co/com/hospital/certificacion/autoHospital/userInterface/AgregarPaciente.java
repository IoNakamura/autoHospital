package co.com.hospital.certificacion.autoHospital.userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AgregarPaciente extends PageObject {

    public static final Target TXT_NOMBRE =
            Target.the("Ingrese el nombre").located(By.name("name"));

    public static final Target TXT_APELLIDO =
            Target.the("Ingrese el apellido").located(By.name("last_name"));

    public static final Target TXT_TELEFONO =
            Target.the("Ingrese el telefono").located(By.name("telephone"));

    public static final Target CB_TIPO_IDENTIFICACION =
            Target.the("Combo box tipo de Cedula de cuidadania").located(By.name("identification_type"));

    public static final Target CB_PASAPORTE =
            Target.the("Combobox").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div[4]/select/option[3]"));

    public static final Target TXT_NUMERO_DOCUMENTO =
            Target.the("Numero de documento de identidad").located(By.name("identification"));

    public static final Target CHK_SALUD_PREPAGADA =
            Target.the("Checkbox para marcar salud prepagada").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div[6]/label/input"));

    public static final Target BTN_GUARDAR_PACIENTE =
            Target.the("Boton guardar datos").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/a"));



}
