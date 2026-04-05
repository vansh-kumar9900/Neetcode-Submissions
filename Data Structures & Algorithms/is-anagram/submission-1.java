class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int n = s.length();
        int m = t.length();
        if(n != m) return false;
        for(char ch : s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(char ch : t.toCharArray()){
            if(!hm.containsKey(ch)){
                return false;
            }
            hm.put(ch,hm.get(ch)-1);
            if(hm.get(ch) < 0){
                return false;
            }
        }
        return true;
    }
}
