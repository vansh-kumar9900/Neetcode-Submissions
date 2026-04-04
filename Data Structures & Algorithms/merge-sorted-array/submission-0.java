class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m+n];
        int i = 0;
        int j = 0;
        while(i < m){
            arr[i] = nums1[i];
            i++;
        }
        while(j < n){
            arr[m+j] = nums2[j];
            j++;
        }
        Arrays.sort(arr);
        for(int k = 0; k < (m+n); k++){
            nums1[k] = arr[k];
        }

    }
}