package com.automatizacion.tasks;

import com.automatizacion.userinterfaces.DashboardPage;
import com.automatizacion.userinterfaces.RegistroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegistrarUsuario implements Task {

    private final String email;
    private final String password;
    private final String nombre;
    private final String apellido;

    public RegistrarUsuario(String email, String password, String nombre, String apellido) {
        this.email = email;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(RegistroPage.EMAIL, isVisible()).forNoMoreThan(20).seconds(),
                WaitUntil.the(RegistroPage.EMAIL, isEnabled()).forNoMoreThan(20).seconds(),

                Enter.theValue(email).into(RegistroPage.EMAIL),
                Enter.theValue(password).into(RegistroPage.PASSWORD),
                Enter.theValue(nombre).into(RegistroPage.NOMBRE),
                Enter.theValue(apellido).into(RegistroPage.APELLIDO),

                WaitUntil.the(RegistroPage.REGISTRARME, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(RegistroPage.REGISTRARME),

                WaitUntil.the(DashboardPage.BOTON_CERRAR_SESION, isVisible()).forNoMoreThan(40).seconds()
        );
    }

    public static RegistrarUsuario conDatos(String email, String password, String nombre, String apellido) {
        return instrumented(RegistrarUsuario.class, email, password, nombre, apellido);
    }
}
