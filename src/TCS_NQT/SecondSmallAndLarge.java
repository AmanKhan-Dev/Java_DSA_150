package TCS_NQT;

public class SecondSmallAndLarge {

    public static void main(String[] args) {
        int arr [] = { 7,11,3,18,27,1,38,65,20,40,64 };
        System.out.println("Second Smallest : " + secondSmall(arr));
        System.out.println("Second Largest : " + secondlargest(arr));
    }
    public static int secondSmall(int arr[]){
        if (arr.length<2){
            return -1;
        }
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<small){
                secondSmall = small;
                small = arr[i];

            }
            else if (arr[i]<secondSmall&& arr[i] != small){
                secondSmall = arr[i];
            }
        }
        return secondSmall;
    }


    public static int secondlargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int secondLargest =Integer.MIN_VALUE;
        if (arr.length<2){
            return -1;
        }

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i]>secondLargest&& arr[i] != largest){
              secondLargest = arr[i];
            }


        }
        return secondLargest;
    }
}
