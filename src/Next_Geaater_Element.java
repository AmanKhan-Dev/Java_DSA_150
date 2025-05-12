import java.util.ArrayList;

public class Next_Geaater_Element {
    public static void main(String[] args) {
        int nums1[] = {4,1,2};
        int nums2[] = {1, 3, 4, 2};
        System.out.println(nextGreaterElement(nums1,nums2));

    }
    public static boolean nextGreaterElement(int[] nums1, int[] nums2) {

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        int totalLength = (nums1.length+nums2.length)-1;


        for (int i = 0; i < l1.size(); i++) {

            l1.add(nums1[i]);


        }
        for (int i = 0; i < l2.size(); i++) {

            l1.add(nums2[i]);


        }

        for (int i = 0; i < totalLength; i++) {

            if (l2.contains(l1.get(i))){
                return true;


            }


        }




        return false;


    }
}
