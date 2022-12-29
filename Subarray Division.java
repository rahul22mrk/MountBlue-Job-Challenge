 public static int birthday(List<Integer> s, int d, int m) {
    // Write your code here
        int start=0,end=0;
        int  n=s.size();
        int sum=0;
        int ans=0;
        if(m<1 || m>12)
            return 0;
        while(end<n)
        {
            sum+=s.get(end);
            end++;
            
            while(start<end&& end-start>m)
            {
                sum-=s.get(start);
                start++;
            }
            
            if(sum==d&& end-start==m)
                ans++;
            
        }
        return ans;

    }
