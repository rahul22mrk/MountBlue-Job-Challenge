public static int squares(int a, int b) {
    // Write your code here
        int cnt=0;
        a = (int)Math.ceil(Math.sqrt(a));
        b = (int)Math.floor(Math.sqrt(b));
        
        cnt=b-a+1;
        return cnt;

    }



///same approach 
 private static int sqrtFloor(int a)
    {
       // int ans=1;
        long start =1;
        long end=a;
        long mid=0;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(mid*mid==a)
                return (int)mid;
            else if(mid*mid<a)
            {
                start=mid+1;
                
            }else{
                
                end=mid-1;
            }
        } 
        
       
        
        return (int)end;
    }
    private static int sqrtCeil(int a)
    {
       // int ans=1;
        long start =1;
        long end=a;
        long mid=0;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(mid*mid==a)
                return (int)mid;
            else if(mid*mid<a)
            {
                start=mid+1;
                
            }else{
                
                end=mid-1;
            }
        } 
        
       
        
        return (int)start;
    }
    public static int squares(int a, int b) {
    // Write your code here
        int cnt=0;
        a = sqrtCeil(a);
       // System.out.println(a);
        //System.out.println((int)Math.ceil(Math.sqrt(a)));
        b = (int)Math.floor(Math.sqrt(b));
       // System.out.println(b);
        cnt=b-a+1;
        return cnt;

    }
