package co.com.choucair.proyectochoucair.tasks;

import co.com.choucair.proyectochoucair.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import sun.rmi.runtime.Log;

public class Login implements Task {
    private String strUsuario;
    private String strContrasenia;

    public Login (String strUsuario, String strContrasenia){
        this.strUsuario = strUsuario;
        this.strContrasenia = strContrasenia;
    }

    public static Login onThePage(String strUsuario, String strContrasenia) {

        return Tasks.instrumented(Login.class,strUsuario, strContrasenia);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BOTON),
                Enter.theValue(strUsuario).into(ChoucairLoginPage.INPUT_USUARIO),
                Enter.theValue(strContrasenia).into(ChoucairLoginPage.INPUT_CONTRASENIA),
                Click.on(ChoucairLoginPage.ACCEDER_BOTON));
    }
}
