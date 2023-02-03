package methodsource.tests;

import methodsource.data.NamesProgrammingLanguage;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class CheckSearchLabirintBooksTests extends TestBase {

    static Stream<Arguments> searchOzonBookTests() {
        return Stream.of(
                Arguments.of(NamesProgrammingLanguage.java, List.of("Изучаем Java", "Java для чайников",
                        "Философия Java", "Java. Полное руководство")),
                Arguments.of(NamesProgrammingLanguage.javascript, List.of("JavaScript. Полное руководство",
                        "Изучаем программирование на JavaScript", "Секреты JavaScript ниндзя",
                        "JavaScript для чайников"))
        );
    }

    @MethodSource("searchOzonBookTests")
    @ParameterizedTest(name = "Для поиска книг на ЯП {0} отображаются книги {1}")
    void searchLabirintBookTests(
            NamesProgrammingLanguage name,
            List<String> book
    ) {
        checkSearchLabirintBooks.openPage();
        checkSearchLabirintBooks.setValue(name.name());
        checkSearchLabirintBooks.verifyResult(book);
    }
}
