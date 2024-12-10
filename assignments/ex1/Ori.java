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
            else {
                break;
            }
        }
        return false;
    }

    public static boolean Number_with_base(String MYnumber) {
        int siz = MYnumber.length();
        if (siz > 2) {
            char base = MYnumber.charAt(siz - 1);
            char limit = MYnumber.charAt(siz - 2);
            if ((limit == 'b') && (('1' <base && base <= '9') || ('A' <= base && base <= 'G'))) {
                for (int i = 0; i < siz - 2; i = i + 1) {
                    char Key = MYnumber.charAt(i);
                    if (('0' <= Key && Key <= '9' || 'A' <= Key && Key < 'G') && (Key < base)) {

                    }
                }
            }
            return false;
        }
        return false;
    }
   /* public static int number2Int(String MYnumber1) {
        int ans = -1;
        int siz = MYnumber1.length();
        String s1 = MYnumber1.substring(0,siz -2);
        String s2 =


        return ans;
    }


    Character.getNumericValue();

    */
}

