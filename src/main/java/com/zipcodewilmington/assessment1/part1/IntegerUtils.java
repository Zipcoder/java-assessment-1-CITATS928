package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int temp=0;
        for(int i=0; i<=n;i++){
            temp+=i;
        }

        return temp;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        int temp=1;
        for(int i=1; i<=n;i++){
            temp*=i;
        }

        return temp;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        String strval=val.toString();
        StringBuilder newstr = new StringBuilder(strval);
        newstr.reverse().toString();
        strval = newstr.toString();
        int reult = Integer.parseInt(strval);


        return reult;
    }
}
