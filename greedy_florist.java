static int getMinimumCost(int k, int[] c) {
        Arrays.sort(c);
        int sum = 0;
        int multiplier = 1;
        int n = c.length;
        for(int  i=n-1; i>=0; i--){
            sum +=  c[i] * multiplier ;
         if((n-i)%k == 0){
             multiplier++;
         }
           
        }
        return sum;
    }
