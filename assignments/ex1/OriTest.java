package assignments.ex1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class OriTest {
    @Test
void isNumber () {
        String GOOD = "1";
        boolean ok = Ori.isNumber(GOOD);
        assertTrue(ok);
    }
}
