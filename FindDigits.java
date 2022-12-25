 public static int findDigits(int n) {
    // Write your code here
        
        int cnt=0;
        int temp=n;
        while(temp!=0)
        {
            int d=temp%10;
            if(d!=0&&n%d==0)
                cnt++;
            temp/=10;
        }
        return cnt;

    }
