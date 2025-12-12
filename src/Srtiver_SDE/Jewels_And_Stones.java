package Srtiver_SDE;



public class Jewels_And_Stones {

    public static void main(String[] args) {

        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));

        
    }
     public static int numJewelsInStones(String jewels, String stones) {
    
int count =0;

        for (int i = 0; i < stones.length(); i++) {
if (jewels.contains(stones.charAt(i)+ "")) {
    count++;
    
}
            
        }

        return count;
    
}
}
