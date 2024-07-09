package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int flagHeight, int junpHeight) {
        int jump = flagHeight/junpHeight;
        if(junpHeight>flagHeight){
            return flagHeight;
        }
        int rest = flagHeight%junpHeight;
        if(rest!=0){
            return jump+rest;
        }

        return jump;
    }
}
