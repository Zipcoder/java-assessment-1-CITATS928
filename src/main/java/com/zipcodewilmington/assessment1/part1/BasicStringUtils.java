package com.zipcodewilmington.assessment1.part1;

import java.sql.Array;
import java.util.Arrays;
import java.util.Locale;


/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
//        String[] arr = str.split(" ");
//        System.out.println(arr[0].toUpperCase(Locale.ROOT));
//        String temp=arr[0].toUpperCase(Locale.ROOT);
//        arr[0]=temp;
//        String result="";
//        for(int i=0;i<arr.length;i++){
//            result +=arr[i]+" ";
//        }
        String first = str.substring(1);
        char result = str.toUpperCase().charAt(0);
        //System.out.println(result);
        //System.out.println(first);
        String result1 = result+first;

        return result1;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder stringBuilder=new StringBuilder(str);
        String result = stringBuilder.reverse().toString();

        return result;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String result = reverse(str);
        result=camelCase(result);



        return result;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return str.substring(1,str.length()-1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] cha=str.toCharArray();
        for(int i=0;i<cha.length;i++){
            char c = cha[i];
            if(Character.isUpperCase(c)){
                cha[i]=Character.toLowerCase(c);
            }else if(Character.isLowerCase(c)){
                cha[i]=Character.toUpperCase(c);
            }
        }
        //String result = new String(cha);
        return new String(cha);
    }
}
