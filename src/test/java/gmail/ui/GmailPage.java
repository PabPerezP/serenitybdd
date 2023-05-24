package gmail.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GmailPage {
    public static final Target RECEIVED = Target.the("Bandeja de recibidos")
            .located(By.xpath("//a[contains(text(), 'Recibidos')]"));
}
