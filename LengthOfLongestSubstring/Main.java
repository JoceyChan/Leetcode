import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args){         
        lengthOfLongestSubstring("abcabcbb");
        // lengthOfLongestSubstring("bbbbb");
        // lengthOfLongestSubstring("pwwkew");
    }
    //public boolean contains  (String str)
    public static int lengthOfLongestSubstring(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++)
            for (int j = i + 1; j <= s.length(); j++)
                if (allUnique(s, i, j)) {
                    ans = Math.max(ans, j - i);
                }
                return ans;
            }
    
    public static boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch)) return false;
                set.add(ch);
        }
    return true;
    }
    
}