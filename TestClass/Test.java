package TestClass;

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();
     //   int [] nums = {2,1,1,-1,100000};
        System.out.println(s.mergeAlternately("ab","pqrs"));
    
    }
}
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
    int i = 0, j = 0;
    
    // Merge characters alternately
    while (i < word1.length() || j < word2.length()) {
        if (i < word1.length()) {
            result.append(word1.charAt(i));
            i++;
        }
        if (j < word2.length()) {
            result.append(word2.charAt(j));
            j++;
        }
    }
    
    return result.toString();
    }
}
