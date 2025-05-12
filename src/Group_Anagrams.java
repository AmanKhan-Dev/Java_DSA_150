import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Group_Anagrams {
    public static void main(String[] args) {
        String strs[] = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));

    }
    public static List<String> groupAnagrams(String[] strs) {

        List<String > finalList = new ArrayList<>();
        for (int i = 0; i <strs.length ; i++) {
            finalList.add(strs[i]);
        }
        Collections.sort(finalList);
        return finalList;

    }
}
