package com.ramesh.springboot.algorithm;

import java.util.Arrays;

public class CyclicRotations {

    // Array Cyclic Algorithms Like need to change after position moved
    // Ex : [7, 3, 5, 2, 6, 3] We need to move 2 position like [6, 3, 7, 3, 5, 2]
    // formula is (i+k) %SIZE => i for index, k Move for position and array sizes.

    public static void main(String[] args) {

        System.out.println(Arrays.toString(convertCyclicRotationArray(new int[] {1,2,3,4,5}, 2)));
    }

    public static int[] convertCyclicRotationArray(int[] intArr, int k){
        int[] result = new int[intArr.length];
        try {
                for (int i = 0; i < result.length; i++) {
                int ind = ((i + k) % result.length);
                result[ind] = intArr[i];
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        return  result;

    }
}


