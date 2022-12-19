public static int countingValleys(int steps, String path) {
    // Write your code here
        //our task to count the valleys means - when we come valley to sea level
        
        int ans=0;
        int cnt=0;
        for(int i=0;i<steps;i++)
        {
            if(path.charAt(i)=='U')
            {
               ans+=1;
                if(ans==0)
                    cnt++;
            }
            else{
                ans-=1;
            }
        }
        return cnt;

    }
