package Srtiver_SDE;


public class Playground {
    public static void main(String[] args) {

        String ss = "abcdefghijklmnopqrstuvwxy";

        noVowels(ss);

        

        


    
}



    public static void noVowels(String string){

      StringBuilder sb = new StringBuilder();

      


        for (int i = 0; i <string.length(); i++) {
            char c = string.charAt(i);
            
 if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                sb.append(c);
            }

        }



System.out.println(sb);

    }

}

      


