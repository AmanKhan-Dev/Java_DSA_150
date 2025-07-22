package CompetativeCodes;

import java.util.Scanner;

public class Petya_and_Strings {
    public static void main(String[] args) {



    Scanner sc = new Scanner(System.in);

    String s1 = sc.next().toLowerCase();
    String s2 = sc.next().toLowerCase();

    int finalResult = s1.compareTo(s2);

    if (finalResult>0){
        System.out.println("1");
    } else if (finalResult<0) {
        System.out.println("-1");
    }
    else {
        System.out.println("0");
    }


    }

}
