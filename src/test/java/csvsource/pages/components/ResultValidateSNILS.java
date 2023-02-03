package csvsource.pages.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ResultValidateSNILS {

    private SelenideElement

            resultCheck = $("#resultcheck"),
            positiveCheck = $(".snils_ok_text"), //верный
            negativeCheck = $(".snils_err_text"); //некорректный

    public void verifyResult() {
        resultCheck.shouldBe();
    }

    public void positiveResultCheck() {
        positiveCheck.shouldHave(Condition.text("верный"));
    }

    public void negativeResultCheck() {
        negativeCheck.shouldHave(Condition.text("некорректный"));
    }

}

