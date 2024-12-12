package assignments.ex1;

/**
 * This class represents a simple solution for Ex1.
 * As defined here: https://docs.google.com/document/d/1AJ9wtnL1qdEs4DAKqBlO1bXCM6r6GJ_J/r/edit/edit
 * In this assignment, we will design a number formatting converter and calculator.
 * In general, we will use Strings as numbers over basis of binary till Hexa.
 * [2-16], 10-16 are represented by A,B,..G.
 * The general representation of the numbers is as a String with the following format:
 * <number><b><base> e.g., “135bA” (i.e., “135”, as 10 is the default base), “100111b2”, “12345b6”,”012b5”, “123bG”, “EFbG”.
 * The following are NOT in the format (not a valid number):
 * “b2”, “0b1”, “123b”, “1234b11”, “3b3”, “-3b5”, “3 b4”, “GbG”, "", null,
 * You should implement the following static functions:
 */
public class Ex1 {
    /**
     * Convert the given number (num) to a decimal representation (as int).
     * It the given number is not in a valid format returns -1.
     *
     * @param num a String representing a number in basis [2,16]
     * @return
     */
    public static int number2Int(String MY_number3) {
        if (isNumber(MY_number3)) {
            if (All_number(MY_number3)) {
                int decimal_value = Integer.parseInt(MY_number3, 10);
                return decimal_value;
            }
            int siz = MY_number3.length();
            String st1_num = MY_number3.substring(0, siz - 2);
            char ch2_base = MY_number3.charAt(siz - 1);
            int int_base;
            if (ch2_base <= '9') {
                char conversion_assistant = '0';
                int_base = ch2_base - conversion_assistant ;
            } else {
                char conversion_assistant2 = '7' ;
                int_base = ch2_base - conversion_assistant2 ;
            }
            int decimal_value1 = Integer.parseInt(st1_num, int_base);
            return decimal_value1;
        }
        int unlawful = -1;
        return unlawful;
    }


    /**
     * This static function checks if the given String (g) is in a valid "number" format.
     *
     * @param a String representing a number
     * @return true iff the given String is in a number format
     */
    public static boolean isNumber(String MY_number) {
        if (All_number(MY_number)) {
            return true;
        }
        if (Number_with_base(MY_number)) {
            return true;
        }
        return false;
    }

    /**
     * Calculate the number representation (in basis base)
     * of the given natural number (represented as an integer).
     * If num<0 or base is not in [2,16] the function should return "" (the empty String).
     *
     * @param num  the natural number (include 0).
     * @param base the basis [2,16]
     * @return a String representing a number (in base) equals to num, or an empty String (in case of wrong input).
     */
    public static String int2Number(int num, int base) {
        String st_base =  Integer.toString(base);
        if ((1 < base && base <= 16 )) {
            int result = num;
            int remainder;
            int counter = 0;
            char[] waste_collection = new char[32];
            while (result != 0) {
                remainder = result % base;
                if ( remainder < 10) {
                    remainder = remainder + 48;
                }
                else {
                    remainder = remainder + 55;
                }
                char ch_remainder = (char) remainder ;
                waste_collection [counter] = ch_remainder ;
                result = result / base;
                counter = counter + 1;
            }

            char[] good_collection = new char[counter] ;
            int loca_go = counter - 1 ;
            for( int loca_wa = 0 ; loca_wa < counter ; loca_wa = loca_wa + 1 ){
                good_collection[loca_go] = waste_collection [loca_wa] ;
                loca_go = loca_go - 1 ;
            }
            String num_in_base = new String(good_collection);
            return num_in_base + "b" + st_base ;
        }
        return "ERR: wrong base, should be [2,16], got (" + st_base + ')' ;
    }


    /**
     * Checks if the two numbers have the same value.
     *
     * @param n1 first number
     * @param n2 second number
     * @return true iff the two numbers have the same values.
     */
    public static boolean equals(String n1, String n2) {
        boolean ans = true;
        // add your code here

        ////////////////////
        return ans;
    }

    /**
     * This static function search for the array index with the largest number (in value).
     * In case there are more than one maximum - returns the first index.
     * Note: you can assume that the array is not null and is not empty, yet it may contain null or none-valid numbers (with value -1).
     *
     * @param arr an array of numbers
     * @return the index in the array in with the largest number (in value).
     */
    public static int maxIndex(String[] arr) {
        int ans = 0;
        // add your code here

        ////////////////////
        return ans;
    }

    public static boolean All_number(String MY_number1) {
        int siz = MY_number1.length();
        int counter = 0;
        for (int i = 0; i < siz; i = i + 1) {
            char candidate = MY_number1.charAt(i);
            if ('0' <= candidate && candidate <= '9') {
                counter = counter + 1;
                if (counter == siz) {
                    return true;
                }
            }
        }
        return false;
    }


    public static boolean Number_with_base(String MY_number2) {
        int siz = MY_number2.length();
        if (siz > 2) {
            char base = MY_number2.charAt(siz - 1);
            char limit = MY_number2.charAt(siz - 2);
            int sum = 0;
            if ((limit == 'b') && (('1' < base && base <= '9') || ('A' <= base && base <= 'G'))) {
                for (int i = 0; i < siz - 2; i = i + 1) {
                    char Key = MY_number2.charAt(i);
                    if (('0' <= Key && Key <= '9' || 'A' <= Key && Key < 'G') && (Key < base)) {
                        sum = sum + 1;
                    }
                }
            }
            if (sum == siz - 2) {
                return true;
            }
            return false;
        }
        return false;
    }
}