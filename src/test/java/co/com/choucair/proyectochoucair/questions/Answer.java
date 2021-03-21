package co.com.choucair.proyectochoucair.questions;

import co.com.choucair.proyectochoucair.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private String pregunta;

    public Answer(String pregunta){
        this.pregunta = pregunta;
    }
    public static Answer toThe(String pregunta){
        return new Answer(pregunta);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado;
        String nombreCurso = Text.of(SearchCoursePage.NOBRE_TITULO).viewedBy(actor).asString();
        if (pregunta.equals(nombreCurso)){
            resultado = true;
        }else{
            resultado = false;
        }
        return resultado;
    }
}
