class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int i = 0;
        int j = n-1;
        while(i < j){
            char ch = s.charAt(i);
            char ch1 = s.charAt(j);
            if(!Character.isLetterOrDigit(ch)) {
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(ch1)) {
                j--;
                continue;
            }
            if(Character.toLowerCase(ch) != Character.toLowerCase(ch1)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
