package test;

public class Coin {
    public static void main(String[] args) {
        int output2 = partTimeJob(4972);
        System.out.println(output2);
    }

    static public int partTimeJob(int k) {
        int coin = 0;
        int[] wallet = new int[]{500, 100, 50 , 10, 5, 1};

        for(int i = 0; i < wallet.length; i++) {
            if(k > 0) {
                int sum = (int)Math.floor((double)k / wallet[i]);
                coin = coin + sum;
                k = k - (wallet[i] * sum);
            }
        }
        return coin;
    }
}
