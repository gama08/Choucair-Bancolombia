package co.com.choucair.proyectochoucair.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BOTON = Target.the("boton que nos muestra el formulario " +
            "para iniciar sesion").located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(),'Ingresar')]"));
    public static final Target INPUT_USUARIO = Target.the("Donde escribimos " +
            "el usuario").located(By.id("username"));
    public static final Target INPUT_CONTRASENIA = Target.the("Donde escribimos " +
            "la contrasenia").located(By.id("password"));
    public static final Target ACCEDER_BOTON = Target.the("boton que confirma el login y " +
            "se autentica").located(By.className("btn-primary"));

}
