class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ans.add(i);
                    ans.add(j);
                }
            }
        }
        int result[]=new int[ans.size()];
        int index=0;
        for(int num:ans){
            result[index++]=num;
        }
        return result;
    }
}
