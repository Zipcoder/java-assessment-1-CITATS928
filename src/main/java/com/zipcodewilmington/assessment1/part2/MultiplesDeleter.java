package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        List<Integer> odd=new ArrayList<>();
        for(Integer num:ints){
            if(num%2==1){
                odd.add(num);
            }
        }

        return odd.toArray(new Integer[0]);
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {

        List<Integer> even=new ArrayList<>();
        for(Integer num:ints){
            if(num%2==0){
                even.add(num);
            }
        }
        return even.toArray(new Integer[0]);
        //return null;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {

        List<Integer> by3=new ArrayList<>();
        for(Integer num:ints){
            if(num%3!=0){
                by3.add(num);
            }
        }
        return by3.toArray(new Integer[0]);
        //return null;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        List<Integer> byn=new ArrayList<>();
        for(Integer num:ints){
            if(num%multiple!=0){
                byn.add(num);
            }
        }
        return byn.toArray(new Integer[0]);
    }
}
