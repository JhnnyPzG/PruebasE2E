package co.com.falabella.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.falabella.pages.CabeceraPage.*;


public class PaginaPruebaStepDefinitions {

    @Dado("que {actor} abre falabella")
    public void abrirPagina(Actor actor) {
        actor.attemptsTo(
                Open.url("https://www.falabella.com.co")
        );
    }
    @Cuando("{actor} mira la pagina cargada selecciona menu")
    public void comprobarMenuBoton(Actor actor) {
        actor.attemptsTo(
                Click.on(CERRAR_TUTORIAL),
                Click.on(MENU_BOTON)
        );
    }
    @Entonces("{actor} deberia poder escribir en la barra de busqueda")
    public void comprobarBarraDeBusqueda(Actor actor) {
        actor.attemptsTo(
                Enter.theValue("prueba").into(BARRA_BUSQUEDA)
        );
    }
}
