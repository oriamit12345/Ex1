package assignments.ex1;

public class Ori {






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
            int loca_go = counter - 1 ;
            for( int loca_wa = 0 ; loca_wa < counter ; loca_wa = loca_wa + 1 ){
                good_collection[loca_go] = waste_collection [loca_wa] ;
                loca_go = loca_go - 1 ;
            }
            String num_in_base = new String(good_collection);
            return num_in_base ;
        }
         String st_base =  Integer.toString(base); ;
        return "ERR: wrong base, should be [2,16], got (" + st_base + ')' ;
    }
}



