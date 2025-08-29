import java.util.HashMap;

public class LongestSubstringWithoutRepeat {
    //L#3
    //optimal solution
    public static void main(String[] args) {
        String s = "cadbzabcd";
        System.out.println("Length: " + lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l = 0, r = 0, maxLen = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        while (r < n) {
            char ch = s.charAt(r);

            // If duplicate found, shrink from left
            while (map.containsKey(ch) && map.get(ch) >= l) {
                l = map.get(ch) + 1; // Move left pointer right after the last occurrence
            }

            // Store latest index of the character
            map.put(ch, r);

            // Update max length
            maxLen = Math.max(maxLen, r - l + 1);

            r++;
        }

        return maxLen;
    }
}
