class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int currmax=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                currmax+=1;
            }
            else{
                currmax=0;
            }
            if(currmax>max){
                max=currmax;
            }
        }
        return max;
    }
}