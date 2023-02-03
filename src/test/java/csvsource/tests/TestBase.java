package csvsource.tests;

import com.codeborne.selenide.Configuration;
import csvsource.pages.CheckValidateSNILS;
import org.junit.jupiter.api.BeforeAll;


public class TestBase {
    CheckValidateSNILS checkValidateSNILS = new CheckValidateSNILS();

    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1600x1600";
        Configuration.baseUrl = "https://propfr.ru/check_snils.html";
    }
}
