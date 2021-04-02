package com.ramesh.springboot.algorithm;

public class Equailibrium {
     // Equilibrium --> samanilai
    // Balanced number of difference like left and right
    // Like 3 1 2 4 3 ==> Balanced 1
     public static void main(String[] args) {
         System.out.println(getEquilibirium(new int[] {2, 1, 2, 4, 3}));
         System.out.println(getEquilibirium(new int[] {-7, 1, 5, 2, -4, 3, 0}));
     }

    public static int getEquilibirium(int[] equilibrm) {
        int leftSum = equilibrm[0];
        int rightSum = 0;
        for(int x: equilibrm) rightSum +=x;
        rightSum -=leftSum;

        int diff = Math.abs(leftSum-rightSum);

        // second scenorio
        for(int i=1; i<equilibrm.length; i++){
            leftSum +=equilibrm[i];
            rightSum -=equilibrm[i];
            int currdiff = Math.abs(leftSum-rightSum);
            if(diff>currdiff) diff = currdiff;
        }
        return diff;
    }

}
