class Solution {
    public int minSubArrayLen(int t, int[] nums) {
        int l=0;
        int len=Integer.MAX_VALUE;
        int c=0;
        for(int r=0;r<nums.length;r++){
            c+=nums[r];
            while(c>=t){
                len=Math.min(len,r+1-l);
                c-=nums[l];
                l++;
                
            }
            
        }
        if(len==Integer.MAX_VALUE)return 0;
        return len;
    }
}
