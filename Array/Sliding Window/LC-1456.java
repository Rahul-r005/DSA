class Solution {
    public int maxVowels(String s, int k) {
        int l=0;
        int max=0,c=0;
        for(int r=0;r<s.length();r++){
            if(isVow(s.charAt(r))){
                c++;
            }
            if(r-l+1>k){
                if(isVow(s.charAt(l))){
                    c--;
                }
                l++;
            }
            if(r+1-l==k){
                max=Math.max(max,c);
            }
        }return max;
    }
     public static boolean isVow(char a){
        return (a=='a'||a=='e'||a=='i'||a=='o'||a=='u');
    }
}
