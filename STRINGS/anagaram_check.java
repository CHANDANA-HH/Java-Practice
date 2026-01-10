package STRINGS;



//Given a text and a pattern, the task is to find if there is an anagram of the pattern present in the text.

import java.util.Scanner;

public class anagaram_check {

    public static boolean containsPermutation(String text, String pattern) {

        if (pattern.length() > text.length())
            return false;

        int[] patCount = new int[256];
        int[] winCount = new int[256];

        int m = pattern.length();

        // Count pattern chars
        for (int i = 0; i < m; i++) {
            patCount[pattern.charAt(i)]++;
            winCount[text.charAt(i)]++;
        }

        // Slide the window
        for (int i = m; i < text.length(); i++) {

            // If counts match → permutation found
            if (matches(patCount, winCount))
                return true;

            // Add next char to window
            winCount[text.charAt(i)]++;

            // Remove leftmost char from window
            winCount[text.charAt(i - m)]--;
        }

        // Check last window
        return matches(patCount, winCount);
    }

    private static boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 256; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
      System.out.println("Enter the first string:");
      String s1 = sc.next();
      System.out.println("Enter the second string");
       String s2 = sc.next();
     
      if (containsPermutation(s1,s2)) {
         System.out.println("Its a anagram");
      } else {
         System.out.println("Its not an anagram");
      }
        
    }
    
}
