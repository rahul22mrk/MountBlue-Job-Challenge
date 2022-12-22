public static int reverse(int n)
    {
        int rev=0;
        while(n!=0)
        {
            rev=rev*10+n%10;
            n/=10;
        }
        return rev;
    }

    public static int beautifulDays(int i, int j, int k) {
    // Write your code here
        int cnt=0;
        for(int l=i;l<=j;l++)
        {
            int rev=reverse(l);
            int dif=(int)Math.abs(rev-l);
          
            if(dif%k==0){
                cnt++;
            }
            
            
        }
        return cnt;
    }
