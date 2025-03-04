// Morre's Voting Algorithm Approach

public class Majority_Elemant {

    public static void main(String[] args) {
int nums[] = {1,1,2,2,1,1,2};


        System.out.println( majorityElement(nums));
    }

    public static int majorityElement(int nums[]){
        int count =0;
        int cand = 0;

        for (int i =0; i < nums.length;i++){
            if (count==0){
                cand = nums[i];
            }

            if (cand ==nums[i] ){
                count ++;
            }
            else {
                count --;
            }
        }
        return cand;

    }
}
