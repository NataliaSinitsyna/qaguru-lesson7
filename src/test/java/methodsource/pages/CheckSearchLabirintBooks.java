package methodsource.pages;

import com.codeborne.selenide.SelenideElement;
import methodsource.pages.components.ResultCheckSearchLabirintBooks;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CheckSearchLabirintBooks {

    private SelenideElement
            inputText = $("#search-field"),
            button = $(".b-header-b-search-e-btn");

    private ResultCheckSearchLabirintBooks resultCheckSearchLabirintBooks = new ResultCheckSearchLabirintBooks();

    public CheckSearchLabirintBooks openPage() {
        open("/");

        return this;
    }

    public CheckSearchLabirintBooks setValue(String value) {
        inputText.click();
        inputText.setValue(value);
        button.click();

        return this;
    }

    public CheckSearchLabirintBooks verifyResult(List<String> value) {
        resultCheckSearchLabirintBooks.verifyResult(value);

        return this;
    }
}
