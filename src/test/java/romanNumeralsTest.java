
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class romanNumeralsTest {

    @ParameterizedTest
    @CsvSource(value = {"1:I"}, delimiter = ':')
    public void checkConvert1to3(int input, String expected) {
        // Arrange - setting up the objects needed for tests
        romanNumerals convert = new romanNumerals();
        // Act and assert
        assertEquals(expected, convert.integerToRomanNumeral(input));
    }

}
