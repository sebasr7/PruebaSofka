package com.reliquias.software.questions;

import com.reliquias.software.userinterfaces.PaginaMensajeCompra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.reliquias.software.userinterfaces.PaginaMensajeCompra.MENSAJE_COMPRA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


@Subject("the displayed title in main page - THANK YOU FOR YOUR ORDER")

public class MensajeCompra implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(MENSAJE_COMPRA, isVisible()).forNoMoreThan(40).seconds());
        return Text.of(MENSAJE_COMPRA).answeredBy(actor);
    }

    public static Question<String> valor() {
        return new MensajeCompra();
    }
}
