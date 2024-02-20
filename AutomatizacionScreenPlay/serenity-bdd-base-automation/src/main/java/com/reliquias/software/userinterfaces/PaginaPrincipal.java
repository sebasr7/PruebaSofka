package com.reliquias.software.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPrincipal {

    public static final Target USERNAME_FIELD = Target.the("Campo para ingresar el usuario").located(By.id("user-name"));
    public static final Target PASSWORD_FIELD= Target.the("Campo para ingresar el password de acceso").located(By.id("password"));
    public static final Target BUTTON_SIGN_IN = Target.the("Boton Iniciar Seccion").located(By.id("login-button"));

    public static final Target ADD_CAR_LABS_BACKPACK = Target.the("Boton agregar al carrito labs backpack").located(By.id("add-to-cart-sauce-labs-backpack"));

    public static final Target ADD_CAR_LABS_BIKE = Target.the("Boton agregar al carrito labs bike").located(By.id("add-to-cart-sauce-labs-bike-light"));

    public static final Target CART = Target.the("Boton carro de compras").located(By.className("shopping_cart_link"));

    private PaginaPrincipal() {
    }

}
