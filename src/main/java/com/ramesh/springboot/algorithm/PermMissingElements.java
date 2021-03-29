package com.ramesh.springboot.algorithm;

public class PermMissingElements {

    public static void main(String[] args){
        // send array value into methods
        System.out.println(permMissingElements(new int[]{1,2,3,4}));
        System.out.println(permMissingElements(new int[]{1,2,3,4,5,6,7,8,9,10,12,13,14,15}));
    }

    private static int permMissingElements(int[] el) {
        // count of total elements value
        int actualTotal = 0;
        for(int countElm:el){
            actualTotal+=countElm;
        }
        int actLength = el.length+1;
        int curTotal = (actLength*(actLength+1))/2;
        int missingVal = curTotal-actualTotal;
        return missingVal;
    }
}
