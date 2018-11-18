package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
	@ParameterizedTest(name = "string={0}, result={1}")
    @CsvSource({ "xxggxx, true", "xxgxx, false", "xxggyygxx, false", "g, false", "gg, true"})
    public void mirrorTest(String string, boolean expectedResult) {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy(string);
        Assertions.assertEquals(expectedResult, result);
    }
}
