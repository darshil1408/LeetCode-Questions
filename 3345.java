class Solution {
    public int smallestNumber(int n, int t) {
       
       
      for(int i=0;i<10;i++){
         int product=1;
        int copy=n;
        while(copy>0){
            int digit=copy%10;
            product*=digit;
            copy=copy/10;
            } 
        if(product%t==0){
            return n;
        }
        n++;

    }
    return 0;
   

    }
}