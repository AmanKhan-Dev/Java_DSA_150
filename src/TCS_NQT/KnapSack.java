package TCS_NQT;

import java.util.*;

public class KnapSack {
    public static void main(String[] args) {

        Map<Integer,Integer> newmap = new HashMap<>();
        newmap.put(11,22);
        newmap.put(15,40);
        newmap.put(25,25);
        newmap.put(35,45);
        newmap.put(17,45);
        Solution(newmap,50);


    }

    public static void Solution(Map<Integer,Integer> myMap,int totalSize){
        float profit = 0;
        HashMap<Integer,Float> allProfits = new HashMap<>();


        for (Map.Entry<Integer,Integer> entries:myMap.entrySet() ){


            int key = entries.getKey();
            float value = entries.getValue();



            profit = value/key;

            allProfits.put(key,profit);



        }
        List<Map.Entry<Integer, Float>> sortedItems = new ArrayList<>(allProfits.entrySet());
        sortedItems.sort((a, b) -> Float.compare(b.getValue(), a.getValue()));

        float totalProfit = 0;

        System.out.println("Items taken (in order):");
        for (Map.Entry<Integer, Float> entry : sortedItems) {
            int weight = entry.getKey();
            int value = myMap.get(weight);

            if (totalSize >= weight) {

                totalProfit += value;
                totalSize -= weight;
                System.out.println("Taken full item: Weight = " + weight + ", Value = " + value);
            } else {
                // Take fractional item
                float fraction = (float) totalSize / weight;
                totalProfit += value * fraction;
                System.out.println("Taken fractional item: Weight = " + weight + ", Value = " + value +
                        ", Fraction taken = " + fraction);
                break; // Knapsack full
            }
        }

        System.out.println("Total profit earned: " + totalProfit);







    }




}
