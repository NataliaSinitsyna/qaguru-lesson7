package valuesource.pages.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.util.Base64;

import static com.codeborne.selenide.Selenide.$;

public class ResultCheckBase64Decoder {

    private SelenideElement

            resultCheck = $("#output");

    public void verifyResult(String value) {
        byte[] encodedBytes = Base64.getEncoder().encode(value.getBytes());
        resultCheck.shouldHave(Condition.text(new String(encodedBytes)));
    }

}
