class Solution{
  public int threeClosestSum(int[] nums,int target){
    int n=nums.length;
        Arrays.sort(nums);
        int totalsum=nums[0]+nums[1]+nums[2];
        for(int i=0;i<n;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                int currentsum=nums[i]+nums[left]+nums[right];
                if(Math.abs(currentsum-target)<Math.abs(totalsum-target)){
                    totalsum=currentsum;
                }else if(currentsum<target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return totalsum;
    }
}
