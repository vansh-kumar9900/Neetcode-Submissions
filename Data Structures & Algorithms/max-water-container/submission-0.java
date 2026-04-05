class Solution {
    public int maxArea(int[] arr) {
        int capacity = 0;
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i < j){
            int first = arr[i];
            int second = arr[j];
            int height = Math.min(first,second);
            int base = j - i;
            int area = height*base;
            capacity = Math.max(capacity,area);
            if(first < second){
                i++;
            }
            else{
                j--;
            }
        }
        return capacity;
    }
}
