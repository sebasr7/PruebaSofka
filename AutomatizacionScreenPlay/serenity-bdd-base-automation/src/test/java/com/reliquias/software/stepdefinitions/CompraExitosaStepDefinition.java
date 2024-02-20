package com.reliquias.software.stepdefinitions;

import com.reliquias.software.interactions.IngresarCredenciales;
import com.reliquias.software.models.UsuarioGenerico;
import com.reliquias.software.questions.MensajeCompra;
import com.reliquias.software.tasks.AgregarProductos;
import com.reliquias.software.tasks.CompletarFormulario;
import com.reliquias.software.tasks.IniciarSesion;
import com.reliquias.software.tasks.NavegarPaginaWeb;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.reliquias.software.utils.UrlPaginaWeb.PAGINA_INICIO_SESION_SAUCEDEMO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class CompraExitosaStepDefinition {

    @Dado("{actor} navega en la pagina saucedemo e ingresa con sus credenciales correctamente")
    public void pepitoNavegaEnLaPaginaSaucedemoEIngresaConSusCredencialesCorrectamente(Actor actor) {


        actor.wasAbleTo(NavegarPaginaWeb.usandoUrl(PAGINA_INICIO_SESION_SAUCEDEMO.getUrl()));


    }

    @Cuando("se realiza el proceso de una compra exitosa")
    public void seRealizaElProcesoDeUnaCompraExitosa() {
        theActorInTheSpotlight().attemptsTo(
                IniciarSesion.paraUsuario(UsuarioGenerico.builder()
                        .user("standard_user")
                        .password("secret_sauce").build()),
                AgregarProductos.alCarrito(),
                CompletarFormulario.paraComprar()

        );

    }

    @Entonces("deberia ver el mensaje THANK YOU FOR YOUR ORDER")
    public void deberiaVerElMensajeTHANKYOUFORYOURORDER() {

        theActorInTheSpotlight().should(
            seeThat(MensajeCompra.valor(), equalToIgnoringCase("Thank you for your order!"))
        );

    }
}
