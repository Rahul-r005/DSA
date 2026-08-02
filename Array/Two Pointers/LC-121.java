class Solution {
    public int maxProfit(int[] nums) {
        int l=0;
        int max=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]<nums[l]){
                l=r;
            }
            max=Math.max(max,nums[r]-nums[l]);
        }return max;
    }
}
