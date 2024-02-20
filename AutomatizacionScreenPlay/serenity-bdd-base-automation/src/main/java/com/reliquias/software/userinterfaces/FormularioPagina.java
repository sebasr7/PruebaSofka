package com.reliquias.software.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioPagina {

    public static final Target BOTON_CHECKOUT = Target.the("Boton checkout").located(By.id("checkout"));

    public static final Target FIRS_NAME = Target.the("Campo primer nombre").located(By.id("first-name"));

    public static final Target LAST_NAME = Target.the("Campo apellido ").located(By.id("last-name"));

    public static final Target POSTAL_CODE = Target.the("Campo codigo postal").located(By.id("postal-code"));

    public static final Target BOTON_CONTINUAR = Target.the("Boton continuar").located(By.id("continue"));

    public static final Target BOTON_FINALIZAR = Target.the("Boton finalizar").located(By.id("finish"));


    private FormularioPagina() {
    }
}
