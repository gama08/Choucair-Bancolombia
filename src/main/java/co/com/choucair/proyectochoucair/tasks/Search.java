package co.com.choucair.proyectochoucair.tasks;

import co.com.choucair.proyectochoucair.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Search implements Task {

    private String curso;

    public Search (String curso){
        this.curso = curso;
    }
    public static Search the(String curso) {
        return Tasks.instrumented(Search.class, curso);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SearchCoursePage.INGRESAR_CURSOS_CERTIF),
                Enter.theValue(curso).into(SearchCoursePage.INPUT_BUSCAR),
                Click.on(SearchCoursePage.BUSCAR_BOTON),
                Click.on(SearchCoursePage.ELEGIR_CURSO));
    }
}
