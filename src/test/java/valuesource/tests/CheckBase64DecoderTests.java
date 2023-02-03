package valuesource.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CheckBase64DecoderTests extends TestBase {
    @ValueSource(strings = {
            "test",
            "cat",
            "dog"
    })

    @ParameterizedTest
    void valueSourceCheckBase64Decoder(String value) {
        checkBase64Decoder.openPage();
        checkBase64Decoder.setValue(value);
        checkBase64Decoder.verifyResult(value);
    }
}
