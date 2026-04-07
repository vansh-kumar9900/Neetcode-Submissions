class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] arr) {
        int i = 0;
        int n = arr.length;
        ArrayList<Integer> temp = new ArrayList<>();
        solver(i,n,temp,arr);
        return ans;
    }
    public void solver(int index, int n, ArrayList<Integer> temp,int[] arr){
        if(index == n){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(arr[index]);
        solver(index+1,n,temp,arr);
        temp.remove(temp.size()-1);
        solver(index+1,n,temp,arr);
    }
}
