package com.zipcodewilmington.assessment1.part5;

import java.sql.SQLOutput;

public class Palindrome {

    public Integer countPalindromes(String input){
        int size=input.length();
        int counter =size;
        System.out.println(size);

        for(int i=0;i<size;i++){
            for(int j=i+2;j<=size;j++){
                String value = input.substring(i,j);
                String reverse = new StringBuilder(value).reverse().toString();
                if(value.equals(reverse)){
                    counter++;
                }
            }
        }

        return counter;
    }
}
