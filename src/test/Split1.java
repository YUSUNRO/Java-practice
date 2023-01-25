package test;

public class Split1 {
    public static void main(String[] args) {
        String output = convertDoubleSpaceToSingle("string  with  double  spaces");
        System.out.println(output);
    }
    static public String convertDoubleSpaceToSingle(String str) {
       String result = "";
       char before = 0;

       for(int i = 0; i < str.length(); i++) {
         if(' ' != before || str.charAt(i) != ' ') {
           result = result + str.charAt(i);
         }
         before = str.charAt(i);
       }
       return result;
     }

}
