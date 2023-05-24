package gmail.questions;

import gmail.ui.GmailPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Step;

public class TheGmailPage implements Question<String> {

    public static Question<String> received() {
        return new TheGmailPage();
    }

    @Override
    @Step("{0} valida la bandeja de recibidos")
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(GmailPage.RECEIVED).getText();
    }
}
