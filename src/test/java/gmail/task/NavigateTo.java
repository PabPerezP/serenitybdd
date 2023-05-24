package gmail.task;

import gmail.ui.GmailHomePage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theGmailHomePage() {
        return Task.where("{0} opens the Gmail home page",
                Open.browserOn().the(GmailHomePage.class));
    }
}
