class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> temp = new ArrayList<>();
        int i = 0;
        int n = nums.length;
        solver(i,n,temp,nums);
        return ans;
    }
    public void solver(int index, int n, List<Integer> temp, int[] nums){
        if(index == n){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[index]);
        solver(index+1,n,temp,nums);
        temp.remove(temp.size()-1);

        int idx = index+1;
        while(idx < n && nums[idx] == nums[idx-1]){
            idx++;
        }
        solver(idx,n,temp,nums);
    }
}
