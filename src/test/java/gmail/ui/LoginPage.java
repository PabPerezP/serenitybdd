package gmail.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target BUTTON_NEXT_PASSWORD = Target.the("Boton Siguiente")
            .located(By.cssSelector("#passwordNext > div > button"));
    public static  Target EMAIL = Target.the("Entrada de Email")
            .located(By.name("identifier"));
    public static Target BUTTON_NEXT_EMAIL = Target.the("Boton Siguiente")
            .located(By.cssSelector("#identifierNext > div > button"));
    public static  Target PASSWORD = Target.the("Entrada de Email")
            .located(By.name("password"));

}
