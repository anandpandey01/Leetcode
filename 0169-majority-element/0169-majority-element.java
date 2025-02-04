class Solution {
    public int majorityElement(int[] nums) {
        int n= nums.length,candidate =-1,count=0;
        for(int i=0;i<nums.length;i++){
             if(count==0){
                candidate = nums[i];
             }
             count += (nums[i] == candidate) ? 1 : -1;
        }
        return candidate;
    
        
    }
}