package CompetativeCodes;
import java.util.*;

public class Poker_Hands {
    private static final String RANKS = "23456789TJQKA";
    private static final String SUITS = "CDHS";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;

            String[] cards = line.split("\\s+");
            if (cards.length != 10) continue;

            String[] blackHand = Arrays.copyOfRange(cards, 0, 5);
            String[] whiteHand = Arrays.copyOfRange(cards, 5, 10);

            int result = compareHands(blackHand, whiteHand);
            if (result > 0) System.out.println("Black wins.");
            else if (result < 0) System.out.println("White wins.");
            else System.out.println("Tie.");
        }
        sc.close();
    }

    static class Hand implements Comparable<Hand> {
        int rank;  // 0-8: High Card to Straight Flush
        List<Integer> values;  // Sorted values for tie-breaking

        Hand(String[] cards) {
            int[] ranks = new int[5];
            char[] suits = new char[5];

            for (int i = 0; i < 5; i++) {
                if (cards[i].length() != 2) {
                    rank = -1;
                    return;
                }
                ranks[i] = RANKS.indexOf(cards[i].charAt(0));
                suits[i] = cards[i].charAt(1);
            }

            Arrays.sort(ranks);
            Map<Integer, Integer> counts = new HashMap<>();
            for (int r : ranks) {
                counts.put(r, counts.getOrDefault(r, 0) + 1);
            }

            boolean flush = suits[0] == suits[1] && suits[1] == suits[2] &&
                    suits[2] == suits[3] && suits[3] == suits[4];
            boolean straight = ranks[4] - ranks[0] == 4 && counts.size() == 5;
            // Special case for Ace-low straight (A,2,3,4,5)
            if (!straight && ranks[0] == 0 && ranks[1] == 1 && ranks[2] == 2 &&
                    ranks[3] == 3 && ranks[4] == 12) {
                straight = true;
                ranks = new int[]{12, 0, 1, 2, 3};  // Reorder for comparison
            }

            List<Integer> sortedValues = new ArrayList<>();
            if (flush && straight) rank = 8;  // Straight Flush
            else if (counts.containsValue(4)) rank = 7;  // Four of a Kind
            else if (counts.containsValue(3) && counts.containsValue(2)) rank = 6;  // Full House
            else if (flush) rank = 5;  // Flush
            else if (straight) rank = 4;  // Straight
            else if (counts.containsValue(3)) rank = 3;  // Three of a Kind
            else if (counts.size() == 3) rank = 2;  // Two Pairs
            else if (counts.size() == 4) rank = 1;  // One Pair
            else rank = 0;  // High Card

            // Prepare values for tie-breaking
            if (rank == 8 || rank == 5 || rank == 4 || rank == 0) {
                // Straight Flush, Flush, Straight, High Card: highest to lowest
                for (int i = 4; i >= 0; i--) sortedValues.add(ranks[i]);
            } else if (rank == 7) {  // Four of a Kind
                for (int r : counts.keySet()) {
                    if (counts.get(r) == 4) sortedValues.add(r);
                }
                for (int r : counts.keySet()) {
                    if (counts.get(r) == 1) sortedValues.add(r);
                }
            } else if (rank == 6) {  // Full House
                for (int r : counts.keySet()) {
                    if (counts.get(r) == 3) sortedValues.add(r);
                }
                for (int r : counts.keySet()) {
                    if (counts.get(r) == 2) sortedValues.add(r);
                }
            } else if (rank == 3) {  // Three of a Kind
                for (int r : counts.keySet()) {
                    if (counts.get(r) == 3) sortedValues.add(r);
                }
                for (int i = 4; i >= 0; i--) {
                    if (counts.get(ranks[i]) == 1) sortedValues.add(ranks[i]);
                }
            } else if (rank == 2) {  // Two Pairs
                List<Integer> pairs = new ArrayList<>();
                for (int r : counts.keySet()) {
                    if (counts.get(r) == 2) pairs.add(r);
                }
                Collections.sort(pairs, Collections.reverseOrder());
                sortedValues.addAll(pairs);
                for (int r : counts.keySet()) {
                    if (counts.get(r) == 1) sortedValues.add(r);
                }
            } else if (rank == 1) {  // One Pair
                for (int r : counts.keySet()) {
                    if (counts.get(r) == 2) sortedValues.add(r);
                }
                for (int i = 4; i >= 0; i--) {
                    if (counts.get(ranks[i]) == 1) sortedValues.add(ranks[i]);
                }
            }
            this.values = sortedValues;
        }

        @Override
        public int compareTo(Hand other) {
            if (this.rank != other.rank) return this.rank - other.rank;
            for (int i = 0; i < this.values.size(); i++) {
                int diff = this.values.get(i) - other.values.get(i);
                if (diff != 0) return diff;
            }
            return 0;
        }
    }

    public static int compareHands(String[] blackHand, String[] whiteHand) {
        Hand black = new Hand(blackHand);
        Hand white = new Hand(whiteHand);
        return black.compareTo(white);
    }
}