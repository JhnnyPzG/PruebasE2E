package co.com.falabella.stepdefinitions;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.falabella.pages.CabeceraPage.CERRAR_TUTORIAL;
import static co.com.falabella.pages.CabeceraPage.MIS_COMPRAS;


public class accederAMisComprasStepDefinitions {

    @Dado("que {actor} Ingresa a la pagina falabella")
    public void abrirWeb(Actor actor) {
        actor.attemptsTo(
                Open.url("https://www.falabella.com.co")
        );
    }

    @Entonces("{actor} entra al apartado mis compras")
    public void entrarAMisCompras(Actor actor) {
        actor.attemptsTo(
                Click.on(CERRAR_TUTORIAL),

                Click.on(MIS_COMPRAS)
        );
    }
}
