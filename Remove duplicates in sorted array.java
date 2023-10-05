class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=0;
        while(i<nums.length){
            while(i<nums.length-1 && nums[i]==nums[i+1]){
                i++;
            }
            nums[j++]=nums[i++];
        }
        return j;
    }
}
