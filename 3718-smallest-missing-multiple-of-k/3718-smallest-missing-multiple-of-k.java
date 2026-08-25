class Solution {
    public int missingMultiple(int[] nums, int k) {
        boolean flag = true;
        int count = 1;
        int x =1;
        while(flag){
            x = k*count;
            for(int i=0; i<nums.length; i++){
                if(x==nums[i]){
                    flag= true;
                    break;
                }else{
                    flag = false;
                }
            }
            count++;
        }
        return x;  
    }
}