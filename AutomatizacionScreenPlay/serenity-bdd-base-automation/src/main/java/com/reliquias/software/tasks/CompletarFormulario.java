package com.reliquias.software.tasks;

import static com.reliquias.software.userinterfaces.FormularioPagina.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CompletarFormulario implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_CHECKOUT),
                Enter.theValue("Sebas").into(FIRS_NAME),
                Enter.theValue("London").into(LAST_NAME),
                Enter.theValue("055421").into(POSTAL_CODE),
                Click.on(BOTON_CONTINUAR),
                Click.on(BOTON_FINALIZAR)


        );

    }
    public static CompletarFormulario paraComprar(){
        return instrumented(CompletarFormulario.class);
    }
}
