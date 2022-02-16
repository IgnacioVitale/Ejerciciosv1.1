import java.util.LinkedList;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 */

public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("au"));
    }

    public static int lengthOfLongestSubstring(String s) {
        LinkedList<Character> list = new LinkedList<>();
        int max = Math.min(s.length(), 1);
        for (int i = 0; i < s.length(); i++) {

            while (list.contains(s.charAt(i))){
                list.poll();
            }
            list.add(s.charAt(i));
            max = Math.max(max, list.size());
        }
        return max;
    }
}
