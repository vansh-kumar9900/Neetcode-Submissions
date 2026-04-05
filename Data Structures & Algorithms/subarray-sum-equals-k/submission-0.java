class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int currsum = 0;
        hm.put(0,1);
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            currsum += nums[i];
            if(hm.containsKey(currsum-k)){
                ans += hm.get(currsum-k);
            }
            hm.put(currsum,hm.getOrDefault(currsum,0)+1);

        }
        return ans;
    }
}