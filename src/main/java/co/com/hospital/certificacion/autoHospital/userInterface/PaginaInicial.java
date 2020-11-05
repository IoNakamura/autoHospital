package co.com.hospital.certificacion.autoHospital.userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicial extends PageObject {

    public static final Target BTN_AGREGAR_DOCTOR =
        Target.the("Seleccionar agregar doctor").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div/div/div[1]/div/a[1]"));
}
