//1790. Check if One String Swap Can Make Strings Equal
//You are given two strings s1 and s2 of equal length. A string swap is an operation where you choose two indices in a string (not necessarily different) and swap the characters at these indices.
//Return true if it is possible to make both strings equal by performing at most one string swap on exactly one of the strings. Otherwise, return false.


class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if(n != m) return false;
        int cnt = 0;
        int first = -1, second = -1;
        for(int i = 0; i<n ; i++){
            if(s1.charAt(i) != s2.charAt(i)){
                 cnt++;
                 if (cnt > 2) return false;
                 if(first == -1) first = i;
                 else second = i;
            }
        }
        if(cnt == 0) return true;

        if( cnt == 2 &&
            s1.charAt(first) == s2.charAt(second) &&
            s1.charAt(second) == s2.charAt(first)
        ) return true;

        return false;
    }
}
