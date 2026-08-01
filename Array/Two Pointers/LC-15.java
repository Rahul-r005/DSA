class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        Arrays.sort(nums); 
        for(int i=0;i<nums.length;i++){
            if(i>0 &&nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int c=nums[i]+nums[j]+nums[k];
                if(c>0){
                    k--;
                }else if(c<0){
                    j++;
                }else{
                    List<Integer>ans=new ArrayList<>();
                    ans.add(nums[i]);
                    ans.add(nums[j]);
                    ans.add(nums[k]);
                    list.add(ans);
                    j++;

                    while(nums[j]==nums[j-1]&&j<k){
                        j++;
                    }
                }
            }
        }return list;
    }
}
