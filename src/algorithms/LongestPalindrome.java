package algorithms;

import java.util.HashSet;
import java.util.Set;

/**
 * Example 1:
 *
 * Input: s = "abccccdd"
 * Output: 7
 * Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
 *
 *
 * Example 2:
 *
 * Input: s = "a"
 * Output: 1
 * Explanation: The longest palindrome that can be built is "a", whose length is 1.
 */
public class LongestPalindrome {

    public static void main(String[] args) {

        int result = longestPalindrome("abaxy");
        System.out.println(result);

    }

    public static int longestPalindrome(String s) {

        if(s.length() == 1)
            return 1;
        Set<Character> set = new HashSet<>();
        int count = 0;
        for (char c : s.toCharArray()){
            if (!set.add(c)){
                count += 2;
                set.remove(c);
            }
            else {
                set.add(c);
            }
        }

        return set.size() == 0 ? count : count + 1;
    }
}
