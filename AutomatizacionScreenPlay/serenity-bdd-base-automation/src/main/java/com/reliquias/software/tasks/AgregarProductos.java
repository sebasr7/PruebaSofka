package com.reliquias.software.tasks;

import com.reliquias.software.userinterfaces.PaginaPrincipal;
import com.reliquias.software.userinterfaces.PaginaPrincipal.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.reliquias.software.userinterfaces.PaginaPrincipal.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarProductos  implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ADD_CAR_LABS_BACKPACK),
                Click.on(ADD_CAR_LABS_BIKE),
                Click.on(CART)

        );

    }
public static AgregarProductos alCarrito(){
    return instrumented(AgregarProductos.class);
}
}
