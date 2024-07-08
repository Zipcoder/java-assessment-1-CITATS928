package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int counter =0;
        for(Object i:objectArray){
            if(objectToCount==i){
                counter++;
            }
        }

        return counter;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {

//        ArrayList<Object> arrayList= new ArrayList<>();
//
//        for(Object i:objectArray){
//            if(objectToRemove!=i){
//                arrayList.add(i);
//            }
//        }
//
//        Object[] rrrrr = new Object[arrayList.size()];
//        for(int i=0;i< arrayList.size();i++){
//            rrrrr[i]= (Object) arrayList.get(i);
//        }
//
//        Object[] result1= new Object[arrayList.size()];
//        result1 = (Object[]) arrayList.toArray();
//
//        Object[] result= arrayList.toArray();
//        System.out.println(Arrays.toString(result));
//
//        return rrrrr;
        return null;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {


        return null;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        return null;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        Object[] result = new Object[objectArray.length+objectArrayToAdd.length];
        int length = objectArray.length+objectArrayToAdd.length;//12
        System.out.println(length);



        for(int i=0;i<=objectArray.length-1;i++){
            result[i]= objectArray[i];

        }
        for(int i=objectArray.length;i<=length-1;i++){
            result[i]= objectArrayToAdd[i-objectArray.length];
        }


        return result;

        //return null;
    }
}
