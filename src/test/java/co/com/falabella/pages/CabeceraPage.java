package co.com.falabella.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CabeceraPage {
    public static Target BARRA_BUSQUEDA = Target.the("barra de busqueda").located(By.id("testId-SearchBar-Input"));

    public static Target MIS_COMPRAS = Target.the("barra de busqueda").located(By.id("testId-userAction-orders"));

    public static Target IR_INICIO = Target.the("volver a inicio").located(By.className("Logo-module_logo-main-wrapper__3g-vZ"));



    public static Target DENEGAR_OFERTAS = Target.the("denegar ofertas").locatedBy("//button[contains(@class,'airship-btn-deny')]");

    public static Target CERRAR_TUTORIAL = Target.the("cerrar tutorial").located(By.id("testId-onboarding-desktop-skip"));


    public static Target MENU_BOTON = Target.the("menu boton").located(By.id("testId-HamburgerBtn-toggle"));

    public static Target TITULO_BARRA_VACIA = Target.the("Titulo").located(By.className("Search-module_headerText__ablmD"));


}
