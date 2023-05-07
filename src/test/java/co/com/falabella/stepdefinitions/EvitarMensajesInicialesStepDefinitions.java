package co.com.falabella.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.Keys;

import static co.com.falabella.pages.CabeceraPage.*;


public class EvitarMensajesInicialesStepDefinitions {

    @Dado("que {actor} Ingresa a falabella")
    public void abrirPagina(Actor actor) {
        actor.attemptsTo(
                Open.url("https://www.falabella.com.co")
        );
    }

    @Entonces("{actor} esta en la pagina se quitara el mensaje de tutorial")
    public void denegarOfertas(Actor actor) {
        actor.attemptsTo(
                Click.on(CERRAR_TUTORIAL)
        );
    }
}
