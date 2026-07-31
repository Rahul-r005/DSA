class Solution {
    public void moveZeroes(int[] nums) {
        int l=0;
        if(nums.length==1)return;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                swap(nums,l,i);
                l++;
            }
        }
    }
    public static void swap(int[]nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}
