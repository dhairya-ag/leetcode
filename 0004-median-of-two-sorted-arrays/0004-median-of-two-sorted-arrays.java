class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] res = new int[n + m];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < n && j < m){
            if(nums1[i] <= nums2[j]){
                res[k++] = nums1[i++];
            }else{
                res[k++] = nums2[j++];
            }
        }
        while(i < n){
            res[k++] = nums1[i++];
        }
        while(j < m){
            res[k++] = nums2[j++];
        }
        int mid = 0;
        if((n + m) % 2 == 0){
            mid = ((n + m) / 2) - 1;
            return (double) (res[mid] + res[mid + 1]) / 2;
        }
        mid = (n + m) / 2;
        return (double) res[mid];
    }
}