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
            boolean not_ok = Ori.isNumber(NOT_GOOD[i]);
            assertFalse(not_ok);
        }
    }

    @Test
    void Number_with_base() {
        String[] GOOD = {"1b2", "1b2", "01b2", "123bA", "ABbG", "0bA"};
        for (int i = 0; i < GOOD.length; i = i + 1) {
            boolean ok = Ori.Number_with_base(GOOD[i]);
            assertTrue(ok);
        }

        String[] NOT_GOOD = {"b2", "2b2"};
        for (int i = 0; i < NOT_GOOD.length; i = i + 1) {
            boolean not_ok = Ori.Number_with_base(NOT_GOOD[i]);
            assertFalse(not_ok);
        }


    }
}


