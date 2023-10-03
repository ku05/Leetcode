class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int c[] = new int[n+m];
        int j=0;
        for(int i=0;i<n;i++){
            c[j++]=nums1[i];
        }
        for(int k=0;k<m;k++){
            c[j++]=nums2[k];
        }
        Arrays.sort(c);
        double median;
        if((n+m)%2==0){
            median=(c[(n+m)/2]+c[(n+m)/2-1])/2.0;
        }else{
            median=c[(n+m)/2];
        }
        return median;
    }
}
