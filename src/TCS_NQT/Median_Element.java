package TCS_NQT;
import java.util.Arrays;
import java.util.Scanner;
public class Median_Element {
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int  median =0;
    int length = sc.nextInt();
    int element[] = new int[length];
    for (int i = 0; i <length; i++) {
        element[i] = sc.nextInt();
    }
    Arrays.sort(element);
    if (length%2!=0){
        median = element[length/2];

    }
    else {

        median = (element[length/2] + element[length/2-1])/2;


    }

    System.out.println(median);




}
}
