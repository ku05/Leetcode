class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int mini=0;
        int result=0;
        while(left<right){
            mini=Math.min(height[right],height[left])*(right-left);
            result=Math.max(mini,result);
            if(height[left]<=height[right]){
                left++;
            }else{
                right--;
            }
        }
        return result;
    }
}
