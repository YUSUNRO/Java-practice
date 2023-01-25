package test;

import java.util.Arrays;

public class GetEvenNumbers {
    public static void main(String[] args) {
        int[] output = getEvenNumbers(new int[]{1, 2, 3, 4});
        System.out.println(output);
    }
    static public int[] getEvenNumbers(int[] arr) {
        int[] concatArray = new int[]{};

        if(arr.length == 0) {
            return new int[]{};
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                concatArray = Arrays.copyOf(concatArray, concatArray.length + 1);
                concatArray[concatArray.length - 1] = arr[i];
            }
        }

        return concatArray;
    }
}
