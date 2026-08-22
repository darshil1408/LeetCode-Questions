class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int product=1;
        int copy_num=n;
        while(n>=1){
            int digit=n%10;
            sum+=digit;
            product*=digit;
            n=(int)(n/10);
        }
        if( copy_num%(sum+product)==0){
            return true;
        }
        return false;   
        
    }
}