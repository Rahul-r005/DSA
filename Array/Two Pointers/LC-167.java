class Solution {
    public int[] twoSum(int[] nums, int t){
        int l=0,r=nums.length-1;
        while(l<r){
            int c=nums[l]+nums[r];
            if(c==t){
                return new int[]{l+1,r+1};
            }else if (c<t){
                l++;
            }else{
                r--;
            }
        }return new int[]{};
    }
}
