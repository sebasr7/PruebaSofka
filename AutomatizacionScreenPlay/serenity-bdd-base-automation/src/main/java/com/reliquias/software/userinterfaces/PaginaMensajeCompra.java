package com.reliquias.software.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaMensajeCompra {


    public static final Target MENSAJE_COMPRA = Target.the("Mensaje de compra finalizada").located(By.className("complete-header"));

    private PaginaMensajeCompra() {
    }

}
