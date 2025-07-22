package TCS_NQT;

public class Div_by_10 {
    public static void main(String[] args) {

        int arr [] = {2,3,4,100};
        System.out.println(booleanSolution(arr));

    }

    public static boolean booleanSolution(int arr[]){


        if (arr[arr.length-1] %10 ==0){
            return true;
        }

        return false;


    }


}
