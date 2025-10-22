package Srtiver_SDE;

public class Repeated_String_Match {
    public static int repeatedStringMatch(String a, String b) {
    int count = 1; // start with first copy
    String temp = a;

    // Repeat enough times: at most b.length()/a.length() + 2
    int maxRepeats = (b.length() / a.length()) + 2;

    while (!temp.contains(b)) {
        if (count > maxRepeats) {
            return -1; // b cannot be formed
        }
        temp = temp.concat(a); // append a
        count++;
    }

    return count;
}

}
