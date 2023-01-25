package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PermutationPractice2 {
    public static void main(String[] args) {
        ArrayList<Integer[]> output1 = newChickenRecipe(new int[]{1, 10, 1100, 1111}, 2);
        System.out.println(output1);
    }
    static public ArrayList<Integer[]> newChickenRecipe(int[] stuffArr, int choiceNum) {

        ArrayList<Integer> freshArr = new ArrayList<>();

        for(int i = 0; i < stuffArr.length; i++) {
            String str = String.valueOf(stuffArr[i]);
            int[] element = str.chars().filter(c -> c == '0').toArray();

            if(element.length <= 2) {
                freshArr.add(stuffArr[i]);
            }
        }
        Collections.sort(freshArr);
        if (freshArr.size() == 0 || freshArr.size() < choiceNum) return null;

        ArrayList<Integer[]> result = new ArrayList<>();
        boolean[] visited = new boolean[freshArr.size()];

        return permutation(choiceNum, new Integer[]{}, result, freshArr, visited, 0);
    }

    static public ArrayList<Integer[]> permutation(int choiceNum, Integer[] bucket, ArrayList<Integer[]> result, ArrayList<Integer> freshArr, boolean[] visited, int depth) {
        if(depth == choiceNum) {
            result.add(bucket);
            return result;
        }

        for(int i = 0; i < freshArr.size(); i++) {
            if(!visited[i]) {
                visited[i] = true;
                Integer[] concatArray = Arrays.copyOf(bucket, bucket.length + 1);
                concatArray[concatArray.length - 1] = freshArr.get(i);

                result = permutation(choiceNum, concatArray, result, freshArr, visited, depth + 1);
                visited[i] = false;
            }
        }
        return result;
    }
}
