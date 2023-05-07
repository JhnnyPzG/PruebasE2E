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


public class ComprobarBusquedaStepDefinitions {

    @Dado("que {actor} se encuentra en la página de inicio de Falabella")
    public void abrirPagina(Actor actor) {
        actor.attemptsTo(
                Open.url("https://www.falabella.com.co")
        );
    }
    @Cuando("{actor} da buscar sin ingresar un producto en la barra de busquedas")
    public void buscarSinProducto(Actor actor) {
        actor.attemptsTo(
                Click.on(CERRAR_TUTORIAL),
                Enter.theValue(" ").into(BARRA_BUSQUEDA).thenHit(Keys.ENTER)
        );
    }
    @Entonces("{actor} podra ver un mensaje de Busqueda Vacia")
    public void comprobarMensajeVacio(Actor actor) {
        actor.attemptsTo(
                Ensure.that(TITULO_BARRA_VACIA).text().isEqualTo("Busqueda Vacia")
        );
    }
}
