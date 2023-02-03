package valuesource.pages;

import com.codeborne.selenide.SelenideElement;
import valuesource.pages.components.ResultCheckBase64Decoder;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CheckBase64Decoder {
    private SelenideElement
            inputText = $("#input"),
            button = $("#submit_text");

    private ResultCheckBase64Decoder resultCheckBase64Decoder = new ResultCheckBase64Decoder();

    public CheckBase64Decoder openPage() {
        open("/");

        return this;
    }
    public CheckBase64Decoder setValue(String value) {
        inputText.click();
        inputText.setValue(value);
        button.click();

        return this;
    }

    public CheckBase64Decoder verifyResult(String value) {
        resultCheckBase64Decoder.verifyResult(value);

        return this;
    }
}

