import java.util.HashMap;
import java.util.Map;

public class Word_PAtt_293 {
    public static void main(String[] args) {

        String pattern = "egg";
        String words = "add";
        System.out.println(wordPattern(pattern,words));

    }



    public static boolean wordPattern(String pattern, String s) {


        String arr [] = s.split(" ");
        Map<Character,String> newMap = new HashMap<>();

        if (pattern.length()!=arr.length){
            return false;
        }


        for (int i = 0; i < pattern.length(); i++) {


            char c = pattern.charAt(i);
            String ss = arr[i];

            if ((newMap.containsKey(c)&& !newMap.get(c).equals(ss)) || (!newMap.containsKey(c) && newMap.values().contains(ss))){


                return false;


            }
            newMap.put(c,ss);


        }
return  true;




    }

}