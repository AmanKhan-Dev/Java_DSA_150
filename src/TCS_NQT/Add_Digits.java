package TCS_NQT;

public class Add_Digits {
    public static void main(String[] args) {
        int num = 38;
        int sum =0;
      String snum= Integer.toString(num);
        for (int i = 0; i < snum.length(); i++) {
          int n1=  Character.getNumericValue(snum.charAt(i));
             sum+=n1;
        }
        System.out.println(sum);
    }
}
