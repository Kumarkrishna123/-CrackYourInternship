package Greedy;

import java.util.Arrays;

public class MinumumDletetationTomakeUniqueString
{
    public static void main(String[] args) {
       String s = "aaabbbcc" ;
        System.out.println(minDeletions(s));
    }
    public static int minDeletions(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        Arrays.sort(freq); // Sort frequencies in ascending order
        int del = 0; // Initialize the deletion count
        for (int i = 24; i >= 0; i--) {
            if (freq[i] == 0) {
                break; // No more characters with this frequency
            }
            if (freq[i] >= freq[i + 1]) {
                int prev = freq[i];
                freq[i] = Math.max(0, freq[i + 1] - 1);
                del += prev - freq[i];
            }
        }
        return del; // Return the minimum deletions required
    }
}
