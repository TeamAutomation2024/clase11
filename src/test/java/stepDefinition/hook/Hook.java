package stepDefinition.hook;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hook {
    @Before
    public  void setTheStage(){
        OnStage.setTheStage(new OnlineCast());

    }
    @Given("ingreso al sistema con el rol {string}")
    public void ingresoAlSistemaConElRol(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(

        );

    }
}
