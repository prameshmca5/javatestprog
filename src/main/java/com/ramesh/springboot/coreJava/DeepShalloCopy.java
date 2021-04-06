package com.ramesh.springboot.coreJava;

import java.util.Arrays;

public class DeepShalloCopy {
    public static void main(String[] args) {
        // shallow copy
        int[] vals = {3, 7, 9};
        Ex e = new Ex(vals);
        e.showData();
        vals[0] = 13;
        e.showData();

        // Deep copy
        int[] vals2 = {3, 7, 9};
        deepCopy dc = new deepCopy(vals2);
        dc.showData();
        vals2[0] = 13;
        dc.showData();
    }
}

class Ex {
   private int[] data;

   public Ex(int[] values){
       data = values;
   }
   public void showData() {
       System.out.println(Arrays.toString(data));
   }
}

class deepCopy {
    private int[] data2;

    public deepCopy(int[] vals){
        data2 = new int[vals.length];
        for (int i=0; i< vals.length; i++){
            data2[i] = vals[i];
        }
    }

    public void showData() {
        System.out.println(Arrays.toString(data2));
    }
}