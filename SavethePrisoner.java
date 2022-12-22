public static int saveThePrisoner(int n, int m, int s) {
   
        int ans=0;
        ans=(m+s-1)%n;
        if(ans==0)
            return n;
        return ans;

    }
