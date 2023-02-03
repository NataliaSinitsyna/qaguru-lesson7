package csvsource.pages;
//1) Написать свои варианты параметризованных веб-тестов (не на поиск в яндексе или гугле)
//1.1) Попробовать разные варианты датапровайдеров (аннотаций), минимум 3

import com.codeborne.selenide.SelenideElement;
import csvsource.pages.components.ResultValidateSNILS;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CheckValidateSNILS {

    private SelenideElement
            firstPartSNILS = $("#snils1"),
            secondPartSNILS = $("#snils2"),
            thirdPartSNILS = $("#snils3"),
            fourthPartSNILS = $("#snils4");

    private ResultValidateSNILS resultValidateSNILS = new ResultValidateSNILS();

    public CheckValidateSNILS openPage() {
        open("/");

        return this;
    }
    public CheckValidateSNILS setSNILS(String firstPart, String secondPart,
                                       String thirdPart, String fourthPart) {
        firstPartSNILS.setValue(firstPart);
        secondPartSNILS.setValue(secondPart);
        thirdPartSNILS.setValue(thirdPart);
        fourthPartSNILS.setValue(fourthPart);

        return this;
    }

    public CheckValidateSNILS verifyResult() {
        resultValidateSNILS.verifyResult();

        return this;
    }

    public CheckValidateSNILS positiveResultCheck() {
        resultValidateSNILS.positiveResultCheck();

        return this;
    }

    public CheckValidateSNILS negativeResultCheck() {
        resultValidateSNILS.negativeResultCheck();

        return this;
    }

}
