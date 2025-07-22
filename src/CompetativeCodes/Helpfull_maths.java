package CompetativeCodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Helpfull_maths {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();

        ArrayList<Character> myArray = new ArrayList<>();

        for (int i = 0; i < num1.length(); i++) {

            if (num1.charAt(i) != '+'){
                myArray.add(num1.charAt(i));

            }

        }
        Collections.sort(myArray);


        StringBuilder sst = new StringBuilder();

        for (int i = 0; i <myArray.size() ; i++) {
               sst.append(myArray.get(i));
               if (i!=myArray.size()-1){
                   sst.append("+");
               }



        }

        System.out.println(sst);



    }
}
