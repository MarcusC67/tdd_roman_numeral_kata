
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class romanNumeralsTest {

    @ParameterizedTest
    @CsvSource(value = {"1:I","2:II","3:III","4:IV","5:V","6:VI","7:VII","8:VIII","9:IX","10:X"}, delimiter = ':')
    public void checkConvert1(int input, String expected) {
        // Arrange - setting up the objects needed for tests
        romanNumerals convert = new romanNumerals();
        // Act and assert
        assertEquals(expected, convert.integerToRomanNumeral(input));
    }

}
