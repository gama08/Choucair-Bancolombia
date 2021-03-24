package co.com.choucair.proyectochoucair.stepdefinitions;

import co.com.choucair.proyectochoucair.model.AcademyChoucairData;
import co.com.choucair.proyectochoucair.tasks.Login;
import co.com.choucair.proyectochoucair.tasks.OpenUp;
import co.com.choucair.proyectochoucair.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import co.com.choucair.proyectochoucair.questions.Answer;

import java.util.List;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que Antonio quiere aprender automatizacion en la academia Choucair$")
    public void queAntonioQuiereAprenderAutomatizacionEnLaAcademiaChoucair(
            List<AcademyChoucairData> academyChoucairData)throws Exception {
        OnStage.theActorCalled("Antonio").wasAbleTo(OpenUp.thePage(),
                (Login.onThePage(academyChoucairData.get(0).getStrUsuario(),academyChoucairData.get(0).getStrContrasenia())));
    }

    @When("^busca el curso en la plataforma de la academia Choucair$")
    public void buscaElCursoRecursosAutomatizacionBancolombiaEnLaPlataformaDeLaAcademiaChoucair(
            List<AcademyChoucairData> academyChoucairData) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCurso()));
    }

    @Then("^encuentra el curso denominado$")
    public void encuentraElCursoDenominadoPruebaTecnicaAnalistaAutomatizacion(
            List<AcademyChoucairData> academyChoucairData) throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCurso())));
    }
}
