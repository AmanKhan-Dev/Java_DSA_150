package TCS_NQT;

import java.util.Scanner;

public class Sample_Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(Permutation(num));

    }

    public static int Permutation(int num){

        int result = 1;
        while (num>0){
            result = result*num;
            num--;

        }
        return result;


    }
}
