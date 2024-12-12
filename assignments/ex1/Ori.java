package assignments.ex1;

public class Ori {


    public static boolean isNumber(String MY_number) {
        if (All_number(MY_number)) {
            return true;
        }
        if (Number_with_base(MY_number)){
            return true;
        }
        return false;
    }



    public static boolean All_number(String MY_number1) {
        int siz = MY_number1.length() ;
        int counter = 0 ;
        for (int i = 0; i < siz; i = i + 1) {
            char candidate = MY_number1.charAt(i);
            if ('0' <= candidate && candidate <= '9') {
                counter = counter + 1 ;
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
            if ((limit == 'b') && (check_base(base))) {
                for (int i = 0; i < siz - 2; i = i + 1) {
                    char Key = MY_number2.charAt(i);
                    if (('0' <= Key && Key <= '9' || 'A' <= Key && Key < 'G') && (Key < base)) {
                        sum = sum + 1;
                    }
                }
            }
            if (sum == siz -2){
                return true;
            }
            return false;
        }
        return false;
    }


    public static boolean check_base(char base){
        if(('1' < base && base <= '9' ) || ('A' <= base && base <= 'G')){
            return true;
        }
        return false;
    }

    public static int number2Int(String MY_number3) {
        if (All_number(MY_number3)){
        if(All_number(MY_number3) ){
            int decimal_value = Integer.parseInt(MY_number3, 10);
            return decimal_value;
        }
        int siz = MY_number3.length() ;
        String s_num = MY_number3.substring(0,siz -2);
        char char_base = MY_number3.charAt(siz- 1);
        int int_base;
        if(char_base <= '9'){
            int_base = char_base - '0';
        }
        else {
            int_base = char_base - '7';
        }
        int decimal_value1 = Integer.parseInt(s_num,int_base);
        return decimal_value1;
       // int ans = -1;
    }  int unlawful = - 1;
        return


    public static String int2Number(int num, int base) {
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
            int j = counter;
            for( int i = 0 ; i <= counter  ; i = i + 1 ){
                good_collection[i] = waste_collection [j] ;
                j = j - 1 ;
            }
            String num_in_base = new String(good_collection);
            return num_in_base ;
        }
        return "ERR: wrong base, should be [2,16], got (*////*)" ;
    }

}



