class Solution {
    public int trap(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int maxleft = 0;
        int maxright = 0;
        for(int i = 0; i < n; i++){
            left[i] = maxleft;
            maxleft = Math.max(maxleft,arr[i]);
        }
        for(int i = n-1; i >= 0 ;i--){
            right[i] = maxright;
            maxright = Math.max(maxright,arr[i]);
        }
        
        int maxWaterTrapped = 0;
        for(int i = 0; i < n; i++){
            int ml = left[i];
            int mr = right[i];
            int height = arr[i];
            int mini = Math.min(ml,mr);
            int area = mini-height;
            if(mini > height) maxWaterTrapped += area;
            
        }

        return maxWaterTrapped;
    }
}
