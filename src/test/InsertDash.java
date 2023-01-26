package test;

public class InsertDash {
    public static void main(String[] args) {
        String output = insertDash("02189");
        System.out.println(output);
    }
    static public String insertDash(String str) {
        if(str.length() == 0) {
            return null;
        }
        String result = "" + str.charAt(0);

        for(int i = 1; i < str.length(); i++) {
            int pre = Character.getNumericValue(str.charAt(i - 1)) % 2;
            int current = Character.getNumericValue(str.charAt(i)) % 2;
            if(pre != 0 && current != 0) {
                result = result + "-";
            }
            result = result + str.charAt(i);
        }
        return result;
        }
    }
