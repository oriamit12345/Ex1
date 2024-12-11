package assignments.ex1;

public class Ori {

    public static boolean isNumber(String MYnumber) {
        if (All_number(MYnumber)) {
            return true;
        }
        if (Number_with_base(MYnumber)){
            return true;
        }
        return false;
    }

    public static boolean All_number(String MYnumber) {
        int siz = MYnumber.length() ;
        for (int i = 0; i < siz; i = i + 1) {
            if ('0' >= MYnumber.charAt(i) && MYnumber.charAt(i) <= '9') {
                if (i == siz - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean Number_with_base(String MYnumber) {
        int siz = MYnumber.length();
        if (siz > 2) {
            char base = MYnumber.charAt(siz - 1);
            char limit = MYnumber.charAt(siz - 2);
            int sum = 0;
            if ((limit == 'b') && (check_base(base)) {
                for (int i = 0; i < siz - 2; i = i + 1) {
                    char Key = MYnumber.charAt(i);
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
   public static int number2Int(String MYnumber1) {
        if(All_number(MYnumber1) ){
            int decimal_value = Integer.parseInt(MYnumber1, 10);
            return decimal_value;

        }

        int siz = MYnumber1.length() ;
        String s_num = MYnumber1.substring(0,siz -2);
        char c_base = MYnumber1.charAt(siz- 1);
        int i_base;
        if(c_base <= '9'){
            i_base = c_base - '0';
        }
        else {
            i_base = c_base - '7';
        }
        int decimal_value1 = Integer.parseInt(s_num,i_base);
        return decimal_value1;
        int ans = -1;
    }


    public static String int2Number(int num, int base) {
        int result = num ;
        int remainder ;
        int counter = 0 ;
        char[] waste_collection = new char [32] ;
        while (result != 0){
            remainder = result % base ;

            result = result / base ;
            counter =  counter +1 ;

        }

    }
    public static boolean check_base(char base){
       if (('1' < base && base <= '9' ) || ('A' <= base && base <= 'G')){
           return true;
       }
        return false;
    }
}


