package assignments.ex1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This JUnit class represents a very partial test class for Ex1.
 * Make sure you complete all the needed JUnits
 */
public class Ex1Test {


    @Test
    void computeNumberTest() {
        String s2 = "1011b2";
        int v = Ex1.number2Int(s2);
        assertEquals(v,11);
        String s10 = "1011bA";
        v = Ex1.number2Int(s10);
        s2 = Ex1.int2Number(v,2);
        int v2 = Ex1.number2Int(s2);
        assertEquals(v,v2);
        assertTrue(Ex1.equals(s10,s2));
    }


    @Test
    void isBasisNumberTest() {
        String[] good = {"1", "1b2", "01b2", "123bA", "ABbG", "0bA"};
        for(int i=0;i<good.length;i=i+1) {
            boolean ok = Ex1.isNumber(good[i]);
            assertTrue(ok);
        }
        String[] not_good = {"b2", "2b2", "1G3bG", " BbG", "0bbA", "abB", "!@b2", "A", "1bb2"};
        for(int i=0;i<not_good.length;i=i+1) {
            boolean not_ok = Ex1.isNumber(not_good[i]);
            assertFalse(not_ok);
        }
    }


    @Test
    void int2Number_test() {
        int[] i1_number_arr ={728,728,42,100,2020,256,17};
        int[] i1_base_arr ={16,4,2,2,16,8,17};
        String[] s1_true_arr = {"2D8","23120", "101010", "1100100", "7E4","400","ERR: wrong base, should be [2,16], got (17)"};

        for(int i = 0; i < i1_number_arr.length; i = i + 1){
            int in1_base = i1_base_arr [i] ;
            int in1_number = i1_number_arr [i] ;
            String s1_result_str = Ori.int2Number(in1_number, in1_base) ;
            String s1_true = s1_true_arr [i] ;
            assertEquals(s1_true, s1_result_str, "numbers not match! expected value was: " + s1_true + " received: " + s1_result_str);
        }
    }


    @Test
    void maxIndexTest() {
        // implement this test
    }


    @Test
    void All_number_test() {

        String[] GOOD = {"1258487", "000111", "123000987"};
        for (int i = 0; i < GOOD.length; i = i + 1) {
            boolean ok = Ori.All_number(GOOD[i]);
            assertTrue(ok);
        }
        String[] NOT_GOOD = {"542ih", "00/124", "12120"};
        for (int i = 0; i < GOOD.length; i = i + 1) {
            boolean not_ok = Ori.All_number(NOT_GOOD[i]);
            assertFalse(not_ok);
        }
    }


    @Test
    void Number_with_base_test() {

        String[] GOOD = {"1b2", "01b2", "123bA", "ABbG", "0bA"};
        for (int i = 0; i < GOOD.length; i = i + 1) {
            boolean ok = Ori.Number_with_base(GOOD[i]);
            assertTrue(ok);
        }
        String[] NOT_GOOD = {"b2", "2b2", "1G3bG", " BbG", "0bbA", "abB", "!@b2", "A", "1bb2"};
        for (int i = 0; i < NOT_GOOD.length; i = i + 1) {
            boolean not_ok = Ori.Number_with_base(NOT_GOOD[i]);
            assertFalse(not_ok);
        }


        @Test
        void number2Int_test() {
            String[] s1_arr = {"1b2","01b2", "123bA", "ABbG", "0bA", "589","58BA"};
            int[] s1_true_arr ={1,1,123,171,0,589,-1};

            for(int i = 0; i < s1_arr.length; i = i + 1){
                String s1 = s1_arr [i] ;
                int s1_result_int = Ori.number2Int(s1);
                int s1_true = s1_true_arr [i] ;
                assertEquals(s1_true, s1_result_int, "numbers not match! expected value was: " + s1_true + " received: " + s1_result_int);
            }
        }
    }


    @Test
    void int2Number_test() {
        int[] i1_number_arr ={728,728,42,100,2020,256,17};
        int[] i1_base_arr ={16,4,2,2,16,8,17};
        String[] s1_true_arr = {"2D8","23120", "101010", "1100100", "7E4","400","ERR: wrong base, should be [2,16], got (17)"};

        for(int i = 0; i < i1_number_arr.length; i = i + 1){
            int in1_base = i1_base_arr [i] ;
            int in1_number = i1_number_arr [i] ;
            String s1_result_str = Ori.int2Number(in1_number, in1_base) ;
            String s1_true = s1_true_arr [i] ;
            assertEquals(s1_true, s1_result_str, "numbers not match! expected value was: " + s1_true + " received: " + s1_result_str);
        }
    }
    // Add additional test functions - test as much as you can.
}