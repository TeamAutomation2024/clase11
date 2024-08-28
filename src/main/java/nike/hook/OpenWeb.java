package nike.hook;

import freemarker.core.Environment;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.ThucydidesSystemProperty;
import net.thucydides.core.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static nike.utils.Constants.WEB_URL;

public class OpenWeb implements Task {
    // se importa libreria import net.thucydides.core.util.EnvironmentVariables;
private EnvironmentVariables enviromentVariables;

    @Override
    public <T extends Actor> void performAs(T actor) {
        String pathWebURL= EnvironmentSpecificConfiguration.from(enviromentVariables).getProperty(WEB_URL);
        actor.attemptsTo(Open.url(pathWebURL));

    }

    @Override
    public Performable then(Performable nextPerformable) {
        return instrumented(OpenWeb.class);
    }
}
