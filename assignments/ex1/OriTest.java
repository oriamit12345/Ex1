package assignments.ex1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class OriTest {
    @Test
    void Allnumber() {

        String[] GOOD = {"1258487", "000111", "123000987"};
        for (int i = 0; i < GOOD.length; i = i + 1) {
            boolean ok = Ori.isNumber(GOOD[i]);
            assertTrue(ok);
        }
        String[] NOT_GOOD = {"542ih", "00/124", "  12120"};
        for (int i = 0; i < GOOD.length; i = i + 1) {
            boolean ok = Ori.isNumber(NOT_GOOD[i]);
            assertFalse(ok);
        }
    }
}