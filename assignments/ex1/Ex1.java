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
    public static int number2Int(String num) {
        // If the string is a valid number
        if (isNumber(num)) {
            // If the number is in base 10
            if (All_number(num)) {
                int decimal_value = Integer.parseInt(num, 10);
                return decimal_value;
            }
            int siz = num.length();
            // Get the number without the base information (substring excluding the last 2 characters)
            String st1_num = num.substring(0, siz - 2);
            char ch2_base = num.charAt(siz - 1);
            int int_base;
            // Determines the base from the last character (if it's a digit between 0-9 or a letter between A-F)
            if (ch2_base <= '9') {
                char conversion_assistant = '0';
                int_base = ch2_base - conversion_assistant ;
            } else {
                char conversion_assistant2 = '7' ;
                int_base = ch2_base - conversion_assistant2 ;
            }
            // Parse the number in the detected base and return the decimal value
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
    public static boolean isNumber(String a) {
        // If the string contains only numbers
        if (All_number(a)) {
            return true;
        }
        // If the string contains a number with a base
        if (Number_with_base(a)) {
            return true;
        }
        // If no valid result is found, returns false
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
            // Loop to divide the number by the base and calculate the remainders
            while (result != 0) {
                remainder = result % base;
                // If remainder is less than 10, turn it into a digit (0-9), else into a letter (A-F)
                if ( remainder < 10) {
                    remainder = remainder + 48;
                }
                else {
                    remainder = remainder + 55;
                }
                // Store the remainder as a character
                char ch_remainder = (char) remainder ;
                waste_collection [counter] = ch_remainder ;
                result = result / base;
                counter = counter + 1;
            }
            // Reverse the order of the digits so the result is correct
            char[] good_collection = new char[counter] ;
            int loca_go = counter - 1 ;
            for( int loca_wa = 0 ; loca_wa < counter ; loca_wa = loca_wa + 1 ){
                good_collection[loca_go] = waste_collection [loca_wa] ;
                loca_go = loca_go - 1 ;
            }
            // If the base is less than or equal to 9, turn the base into a digit, otherwise into a letter (for base 16)
            String num_in_base = new String(good_collection);
            int base_1 ;
            if(base <= 9){
               base_1 = base + '0' ;
            }
            else {
                base_1 = base + '7' ;
            }
            char ch_base_1 = (char) base_1 ;
            return num_in_base + "b" + ch_base_1 ;
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
        int int_n1 = number2Int(n1) ;
        int int_n2 = number2Int(n2) ;
        return int_n1 == int_n2;
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
        // Starts with the first value in the array and converts it to an integer
        int int_max_arr = Ex1.number2Int(arr [0]);
        int int_max_arr_check ;
        // Loop that goes through the array and finds the maximum value
        for(int i = 0 ; i < arr.length ; i = i + 1 ){
            int_max_arr_check = Ex1.number2Int(arr [i]);
            // If the current value in the array is greater, update the maximum value
            if (int_max_arr < int_max_arr_check ){
                int_max_arr = int_max_arr_check ;
            }
        }
        return int_max_arr ;
    }


    public static boolean All_number(String MY_number1) {
        int siz = MY_number1.length();
        int counter = 0;
        // Loop that goes through each character in the string
        for (int i = 0; i < siz; i = i + 1) {
            char candidate = MY_number1.charAt(i);
            if ('0' <= candidate && candidate <= '9') {
                counter = counter + 1;
                // If all characters are digits, return true
                if (counter == siz) {
                    return true;
                }
            }
        }
        return false;
    }


    public static boolean Number_with_base(String MY_number2) {
        int siz = MY_number2.length();
        // If the string is longer than 2 characters
        if (siz > 2) {
            // Checks the last character, which represents the base
            char base = MY_number2.charAt(siz - 1);
            // Checks the character before the last one ('b')
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
            // If all characters before 'b' are valid, return true
            if (sum == siz - 2) {
                return true;
            }
            return false;
        }
        return false;
    }


}