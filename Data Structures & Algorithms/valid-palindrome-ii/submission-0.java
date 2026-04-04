class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        int i = 0;
        int j = n-1;
        while(i <= j){
            if(s.charAt(i) != s.charAt(j)){
                boolean check1 = isPalindrome(i,j-1,s);
                boolean check2 = isPalindrome(i+1,j,s);
                if(check1 || check2){
                    return true;
                }
                else{
                    return false;
                }
                // return check1 || check2;
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean isPalindrome(int i, int j, String s){
        while(i <= j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}