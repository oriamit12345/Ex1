package assignments.ex1;

public class Ori {

    public static void main(String[] args) {
    }


    public static boolean isNumber(String MYnumber) {

        int siz = MYnumber.length() - 1;
        char Base = MYnumber.charAt(siz);


        for (int i = 0 ; i <= siz ; i = i + 1 ){

            if( ('0' < MYnumber.charAt(i) && MYnumber.charAt(i) <'9') && i == siz ){
                return true;
            }
        }

        char Limit = MYnumber.charAt(siz - 1);
        if (Limit == 'b' && ( '1' < Base && Base <= '9' || 'A' <= Base && Base <= 'G' ) ){
            for (int i = 0 ; i < (siz - 1) ; i = i + 1){
                char Key = MYnumber.charAt(i);
                if (('0' <= Key && Key <='9' || 'A' <= Key && Key <= 'G' ) && Key < Base ){
                    return true ;
                }
            }

        }
        return false ;
    }
}