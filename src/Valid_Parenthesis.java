import java.util.Stack;

public class Valid_Parenthesis {
    public static void main(String[] args) {
        String s  = "()[]{})";
        System.out.println(isValid(s));




    }
    public static boolean isValid(String s) {

        Stack<Character> newStack = new Stack<>();


        for (char  c : s.toCharArray()){

            if (c=='('){
                newStack.push(')');
            } else if (c=='[') {
                newStack.push(']');
            }
            else if (c=='{') {
                newStack.push('}');
            } else if (newStack.empty() || newStack.pop() != c) {
                return false;
                
            }


        }

        return newStack.isEmpty();




    }


}
