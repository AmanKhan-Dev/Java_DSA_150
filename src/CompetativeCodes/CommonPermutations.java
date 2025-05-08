package CompetativeCodes;

import java.util.Scanner;

public class CommonPermutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input until end of file
        while (scanner.hasNextLine()) {
            String s1 = scanner.nextLine();
            if (!scanner.hasNextLine()) break;  // Safety for uneven input
            String s2 = scanner.nextLine();

            int[] freq1 = new int[26];
            int[] freq2 = new int[26];

            // Count frequency of each character in s1
            for (char c : s1.toCharArray()) {
                freq1[c - 'a']++;
            }

            // Count frequency of each character in s2
            for (char c : s2.toCharArray()) {
                freq2[c - 'a']++;
            }

            // Print common characters in lexicographical order
            for (int i = 0; i < 26; i++) {
                int common = Math.min(freq1[i], freq2[i]);
                for (int j = 0; j < common; j++) {
                    System.out.print((char) (i + 'a'));
                }
            }
            System.out.println(); // Move to next line for the next pair
        }

        scanner.close();
    }
}

