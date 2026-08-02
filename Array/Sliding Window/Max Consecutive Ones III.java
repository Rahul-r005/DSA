class Solution {
    public int longestOnes(int[] nums, int k) {
        int j=0;
        int l=Integer.MIN_VALUE;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c++;
            }
            while(c>k){
                if(nums[j]==0){
                    c--;
                }j++;
            }
            l=Math.max(l,i-j+1);
        }return l;
    }
}
