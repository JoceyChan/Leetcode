public class Main {
    public static void main(String[] args){
        lengthOfLongestSubstring("abcabcbb");
        // lengthOfLongestSubstring("bbbbb");
        // lengthOfLongestSubstring("pwwkew");
    }
    //public boolean contains  (String str)
    public static int lengthOfLongestSubstring(String s) {
        int count = 0;
        char[] dup = s.toCharArray();

        for(int i = 0; i < s.length(); i++){
            if(dup[i] != dup[i+1]){
                System.out.println(dup[i]);
                count++;   
            }
            else if(dup[i] == dup[i+1]){
                break;
            } 
        }
    System.out.println(count);
    return count;
}}