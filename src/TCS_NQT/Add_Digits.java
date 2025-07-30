package TCS_NQT;

public class Add_Digits {
    public static void main(String[] args) {
        int s = 38;
        System.out.println(Add_Digits(s));



    }

    public static int Add_Digits(int num) {
        if (num <= 9) {
            return num;
        }

        int sum = 0;
        String snum = Integer.toString(num);

        for (int i = 0; i < snum.length(); i++) {
            int n1 = Character.getNumericValue(snum.charAt(i));
            sum += n1;
        }

        return Add_Digits(sum); // make recursive call **after** loop
    }
}
