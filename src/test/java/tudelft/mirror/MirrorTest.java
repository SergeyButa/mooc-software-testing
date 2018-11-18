package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MirrorTest {
	@ParameterizedTest(name = "string={0}, result={1}")
    @CsvSource({ "abXYZba, ab", "abca, a", "aba, aba", "abba, abba"})
    public void mirrorTest(String string, String expectedResult) {
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds(string);
        Assertions.assertEquals(expectedResult, result);
    }
}
