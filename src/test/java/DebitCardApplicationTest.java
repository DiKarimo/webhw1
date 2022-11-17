import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DebitCardApplicationTest {

    @Test
    public void shouldSuccessfullyAcceptTheApplication () {
        open ("http://localhost:9999");
        $("[data-test-id=\"name\"] input").sendKeys("Гадя Хренова");
        $("[data-test-id=\"phone\"] input").sendKeys("+66666666666");
        $("[data-test-id=\"agreement\"] span").click();
        $("[class=\"button__content\"] span").click();
        $("[data-test-id=\"order-success\"]").shouldHave(Condition.text("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));

    }


}
