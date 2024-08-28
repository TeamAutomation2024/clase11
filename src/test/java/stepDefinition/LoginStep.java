package stepDefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LoginStep {


@Before
public void setTheStage(){
    OnStage. setTheStage(new OnlineCast());
}
    @When("ingreso las credenciales")
    public void ingresoLasCredenciales() {


    }
    @Then("se muestra la web principal")
    public void seMuestraLaWebPrincipal() {


    }
}
