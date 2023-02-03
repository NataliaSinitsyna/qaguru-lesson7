package valuesource.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import valuesource.pages.CheckBase64Decoder;


public class TestBase {
    CheckBase64Decoder checkBase64Decoder = new CheckBase64Decoder();

    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1600x1600";
        Configuration.baseUrl = "https://www.base64encode.org";
    }
}
