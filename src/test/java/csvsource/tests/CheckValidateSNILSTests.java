package csvsource.tests;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CheckValidateSNILSTests extends TestBase{
    @CsvSource(value = {
        "545, 545, 455, 07",
        "742, 547, 783, 25",
        "243, 324, 976, 61"
    })

    @ParameterizedTest
    void positiveCheckValidateSNILS(String firstPart, String secondPart,
                               String thirdPart, String fourthPart) {
        checkValidateSNILS.openPage();
        checkValidateSNILS.setSNILS(firstPart, secondPart, thirdPart, fourthPart);
        checkValidateSNILS.verifyResult();
        checkValidateSNILS.positiveResultCheck();
    }

        @CsvSource(value = {
        "545, 545, 455, 77",
        "742, 547, 783, 55",
        "243, 324, 976, 11"
    })

    @ParameterizedTest
    void negativeCheckValidateSNILS(String firstPart, String secondPart,
                               String thirdPart, String fourthPart) {
        checkValidateSNILS.openPage();
        checkValidateSNILS.setSNILS(firstPart, secondPart, thirdPart, fourthPart);
        checkValidateSNILS.verifyResult();
        checkValidateSNILS.negativeResultCheck();
    }

}
