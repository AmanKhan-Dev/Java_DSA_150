public class Problem_28_index {
    public static void main(String[] args) {

        System.out.println(strStr("butsad","sad"));

    }




    public static int strStr(String haystack, String needle) {



        for (int k = 0; k <= haystack.length()-needle.length(); k++) {

            if (haystack.substring(k,k+needle.length()).equals(needle)){

                return k;


            }





        }

        return -1;
    }
}
