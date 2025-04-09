package CompetativeCodes;

import java.util.*;

public class Stack_Em_Up {
    static final String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
    static final String[] values = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine()); // number of test cases
        sc.nextLine(); // blank line

        while (T-- > 0) {
            int n = Integer.parseInt(sc.nextLine()); // number of shuffles
            int[][] shuffles = new int[n][52];

            // Read n shuffles
            for (int i = 0; i < n; i++) {
                int count = 0;
                while (count < 52) {
                    if (!sc.hasNextLine()) break;
                    String line = sc.nextLine().trim();
                    if (line.isEmpty()) continue;
                    String[] parts = line.trim().split("\\s+");
                    for (String p : parts) {
                        if (!p.isEmpty()) {
                            shuffles[i][count++] = Integer.parseInt(p) - 1;
                        }
                    }
                }
            }

            // Initialize ordered deck (0 to 51)
            int[] deck = new int[52];
            for (int i = 0; i < 52; i++) {
                deck[i] = i;
            }

            // Read the shuffle sequence
            List<Integer> shuffleSeq = new ArrayList<>();
            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();
                if (line.isEmpty()) break;
                shuffleSeq.add(Integer.parseInt(line) - 1); // convert to 0-based index
            }

            // Apply shuffles
            for (int idx : shuffleSeq) {
                int[] newDeck = new int[52];
                for (int i = 0; i < 52; i++) {
                    newDeck[i] = deck[shuffles[idx][i]];
                }
                deck = newDeck;
            }

            // Print final deck
            for (int i = 0; i < 52; i++) {
                int card = deck[i];
                String value = values[card % 13];
                String suit = suits[card / 13];
                System.out.println(value + " of " + suit);
            }

            // Print a blank line between test cases
            if (T > 0) System.out.println();
        }

        sc.close();
    }
}
