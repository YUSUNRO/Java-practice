package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int M = 4;
        int N = 8;
        ArrayList<Integer[]> output = divideChocolateStick(M, N);
        System.out.println(output);
    }
    static ArrayList<Integer[]> divideChocolateStick(int M, int N) {
    ArrayList<Integer[]> result = new ArrayList<>();

    int GCD = gcd(M, N);
    int sqrt = (int)Math.floor(Math.sqrt(GCD));

    for(int left = 1; left <= sqrt; left++) {
        if(GCD % left == 0) {
            result.add(new Integer[]{left, M / left, N / left});
            if(left * left < GCD) {
                int right = GCD / left;
                result.add(new Integer[]{right, M / right, N / right});
            }
        }
    }
    Collections.sort(result, new Comparator<Integer[]>() {
        @Override
        public int compare(Integer[] o1, Integer[] o2) {
            return o1[0].compareTo(o2[0]);
        }
    });
    return result;
}
    static int gcd(int m, int n) {
        if (m % n == 0) return n;
        return gcd(n, m % n);
    }
}
