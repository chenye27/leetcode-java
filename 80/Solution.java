class Solution {
    public int removeDuplicates(int[] nums) {
        int p1 =0, p2 =0;
       while(p2<=nums.length -1){
           if(p1 > 1 && nums[p2] == nums[p1-2]) p2++;
           else{
               nums[p1] =nums[p2];
               p1++;
               p2++;
           }
       } 
        
        return p1;
    }
}