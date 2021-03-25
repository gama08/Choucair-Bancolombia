package co.com.choucair.proyectochoucair.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage{

    public static  final Target INGRESAR_CURSOS_CERTIF = Target.the("Dando clic envia a pantalla de " +
            "cursos y certificaciones").located(By.xpath(".//a[@class = 'card_index']//img[@alt='Cursos y Certificaciones']"));
    public static final Target INPUT_BUSCAR = Target.the("Donde escribimos el curso que " +
            "se quiere buscar").located(By.id("coursesearchbox"));
    public static final Target BUSCAR_BOTON = Target.the("Ir a buscar el " +
            "curso").located(By.xpath(".//button[@class='btn btn-secondary']"));
    public static final Target ELEGIR_CURSO = Target.the("Elegir Prueba tecnica - " +
            "Analista Bancolombia").located(By.linkText("Prueba T\u00e9cnica - Analista Bancolombia"));
    public static final Target NOBRE_TITULO = Target.the("Nombre del titulo").located(By.xpath(".//div[@class='page-header-headings']//h1[contains(text(), 'Prueba " +
            "T\u00e9cnica - Analista Bancolombia')]"));

}
