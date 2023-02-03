package methodsource.tests;

import com.codeborne.selenide.Configuration;
import methodsource.pages.CheckSearchLabirintBooks;
import org.junit.jupiter.api.BeforeAll;


public class TestBase {

    CheckSearchLabirintBooks checkSearchLabirintBooks = new CheckSearchLabirintBooks();

    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1600x1600";
        Configuration.baseUrl = "https://www.labirint.ru";
    }
}