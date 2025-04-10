package CompetativeCodes;

import java.util.*;

public class WERTYU {
    // Define the QWERTY keyboard row as a string
    private static final String keyboard = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            StringBuilder decoded = new StringBuilder();

            for (char ch : input.toCharArray()) {
                // For space or characters not in the keyboard layout
                if (ch == ' ' || keyboard.indexOf(ch) == -1) {
                    decoded.append(ch);
                } else {
                    int pos = keyboard.indexOf(ch);
                    decoded.append(keyboard.charAt(pos - 1));
                }
            }

            System.out.println(decoded.toString());
        }

        sc.close();
    }
}
