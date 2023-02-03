package methodsource.pages.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;

public class ResultCheckSearchLabirintBooks {

    private SelenideElement
        resultCheck = $(".genres-carousel__container.products-row");

    public void verifyResult(List<String> value) {
        for (int i=0; i < value.size(); i++) {
            resultCheck.shouldHave(Condition.text(value.get(i)));
        }
    }
}
