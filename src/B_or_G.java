import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B_or_G {
    public static void main(String[] args) {


        Scanner sc = new Scanner (System.in);
        String word = sc.next();
       String finalWord=  word.toLowerCase();

        Set<Character> newWord = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {

            newWord.add(finalWord.charAt(i));

        }

        if (newWord.size()%2==0){
            System.out.println("CHAT WITH HER!\n");
        }
        else {
            System.out.println("IGNORE HIM!\n");
        }





    }
}
