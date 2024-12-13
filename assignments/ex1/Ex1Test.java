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
    void number2Int_Test() {
        String[] s1_arr = {"1b2","01b2", "123bA", "ABbG", "0bA", "589","58BA","1011b2"};
        int[] s1_true_arr ={1,1,123,171,0,589,-1,11};

        for(int i = 0; i < s1_arr.length; i = i + 1){
            String s1 = s1_arr [i] ;
            int s1_result_int = Ex1.number2Int(s1);
            int s1_true = s1_true_arr [i] ;
            assertEquals(s1_true, s1_result_int, "numbers not match! expected value was: " + s1_true + " received: " + s1_result_int);
        }
    }


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
        String[] s1_true_arr = {"2D8b16","23120b4", "101010b2", "1100100b2", "7E4b16","400b8","ERR: wrong base, should be [2,16], got (17)"};
        // A loop that goes through each value in the arrays and performs the test
        for(int i = 0; i < i1_number_arr.length; i = i + 1){
            // Current base
            int in1_base = i1_base_arr [i] ;
            // Current number
            int in1_number = i1_number_arr [i] ;
            // Calls int2Number function
            String s1_result_str = Ex1.int2Number(in1_number, in1_base) ;
            // Expected result for the current number and base
            String s1_true = s1_true_arr [i] ;
            assertEquals(s1_true, s1_result_str, "numbers not match! expected value was: " + s1_true + " received: " + s1_result_str);
        }
    }


    @Test
    void maxIndexTest() {
            String[][] s1_arr = {{"1b2","01b2", "123bA", "ABbG"}, {"0bA", "589bA","58","1011b2"},{"7DBbG","11100010111b2","214b8",}};
            int[] i1_true_arr ={171,589,2011};

            for(int i = 0; i < i1_true_arr.length; i = i + 1){
                int i1_to_int = Ex1.maxIndex (s1_arr [i]);
                int i1_true = i1_true_arr [i] ;
                assertEquals(i1_true, i1_to_int, "numbers not match! expected value was: " + i1_true + " received: " + i1_to_int);
            }
        }


    @Test
    void All_number_test() {

        String[] GOOD = {"1258487", "000111", "123000987"};
        for (int i = 0; i < GOOD.length; i = i + 1) {
            boolean ok = Ex1.All_number(GOOD[i]);
            assertTrue(ok);
        }
        String[] NOT_GOOD = {"542ih", "00/124", " 12120"};
        for (int i = 0; i < GOOD.length; i = i + 1) {
            boolean not_ok = Ex1.All_number(NOT_GOOD[i]);
            assertFalse(not_ok);
        }
    }


    @Test
    void Number_with_base_test() {

        String[] GOOD = {"1b2", "01b2", "123bA", "ABbG", "0bA"};
        for (int i = 0; i < GOOD.length; i = i + 1) {
            boolean ok = Ex1.Number_with_base(GOOD[i]);
            assertTrue(ok);
        }
        String[] NOT_GOOD = {"b2", "2b2", "1G3bG", " BbG", "0bbA", "abB", "!@b2", "A", "1bb2"};
        for (int i = 0; i < NOT_GOOD.length; i = i + 1) {
            boolean not_ok = Ex1.Number_with_base(NOT_GOOD[i]);
            assertFalse(not_ok);
        }
    }
}