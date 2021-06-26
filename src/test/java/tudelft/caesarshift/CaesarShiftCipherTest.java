package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {
    @ParameterizedTest(name = "{0} : {2}={1}")
    @CsvSource({
            "'abc','def',3", "'xyz','abc',3", "'xyz','bcd',4"
    })
    public void ceasertester(String input,String expected,int shift) {
        CaesarShiftCipher cph = new CaesarShiftCipher();
        String result = cph.CaesarShiftCipher(input, shift);
        Assertions.assertEquals(expected, result);
    }
}
