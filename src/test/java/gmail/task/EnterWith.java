package gmail.task;

import gmail.ui.LoginPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

public class EnterWith implements Task {

    private final String user;
    private final String password;

    public EnterWith(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public static EnterWithBuilder user(String user) {
        return new EnterWithBuilder(user);
    }

    @Override
    @Step("{0} decidio ingresar a su cuenta con usuario: #user y contraseña #password")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user).into(LoginPage.EMAIL),
                Click.on(LoginPage.BUTTON_NEXT_EMAIL),
                WaitUntil.the(LoginPage.PASSWORD, WebElementStateMatchers.isVisible()),
                Enter.theValue(password).into(LoginPage.PASSWORD),
                Click.on(LoginPage.BUTTON_NEXT_PASSWORD)
        );
    }

    public static class EnterWithBuilder {
        private String user;

        public EnterWithBuilder(String user) {
            this.user = user;
        }

        public Performable password(String password) {
            return Instrumented.instanceOf(EnterWith.class)
                    .withProperties(user, password);
        }
    }
}
