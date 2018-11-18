package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {
	@ParameterizedTest(name = "string={0}, shift= {1}, result={2}")
    @CsvSource({ "a, 1, b", "a, 26, a", "xyz, 3, abc"})
    public void mirrorTest(String string, int shift, String expectedResult) {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.CaesarShiftCipher(string, shift);
        Assertions.assertEquals(expectedResult, result);
    }
}
