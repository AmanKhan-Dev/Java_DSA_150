package CompetativeCodes;

import java.util.*;

public class Crypt_Kicker2 {
    private static final String TARGET = "the quick brown fox jumps over the lazy dog";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        sc.nextLine(); // Consume the blank line after the number of test cases

        for (int t = 0; t < testCases; t++) {
            List<String> lines = new ArrayList<>();
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.isEmpty()) break;
                lines.add(line);
            }

            Map<Character, Character> decryptionMap = null;

            for (String candidate : lines) {
                if (candidate.length() != TARGET.length()) continue;
                Map<Character, Character> tempMap = new HashMap<>();
                Set<Character> used = new HashSet<>();
                boolean valid = true;

                for (int i = 0; i < TARGET.length(); i++) {
                    char encChar = candidate.charAt(i);
                    char realChar = TARGET.charAt(i);

                    if (realChar == ' ') {
                        if (encChar != ' ') {
                            valid = false;
                            break;
                        }
                    } else {
                        if (tempMap.containsKey(encChar)) {
                            if (tempMap.get(encChar) != realChar) {
                                valid = false;
                                break;
                            }
                        } else {
                            if (used.contains(realChar)) {
                                valid = false;
                                break;
                            }
                            tempMap.put(encChar, realChar);
                            used.add(realChar);
                        }
                    }
                }

                if (valid && tempMap.size() >= 26) {
                    decryptionMap = tempMap;
                    break;
                }
            }

            if (t > 0) System.out.println(); // Blank line between test cases

            if (decryptionMap == null) {
                System.out.println("No solution.");
            } else {
                for (String line : lines) {
                    StringBuilder sb = new StringBuilder();
                    for (char ch : line.toCharArray()) {
                        if (ch == ' ') {
                            sb.append(' ');
                        } else {
                            sb.append(decryptionMap.getOrDefault(ch, ch));
                        }
                    }
                    System.out.println(sb);
                }
            }
        }
    }
}
