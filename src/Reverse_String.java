public class Reverse_String {
    public static void main(String[] args) {
        System.out.println(Reversed_String("the sky is blue"));
        System.out.println(Reversed_String("  hello world  "));
        System.out.println(Reversed_String("a good   example"));


    }


    public static String Reversed_String(String s){

        String[] newString = s.trim().split("\\s+");


        StringBuilder finalString = new StringBuilder();
        for (int i = newString.length-1;i>=0;i--){
            finalString.append(newString[i]);
            if (i!=0){
                finalString.append(" ");
            }
        }
        return finalString.toString();


    }
}
