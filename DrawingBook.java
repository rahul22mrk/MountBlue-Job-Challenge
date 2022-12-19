public static int pageCount(int n, int p) {
    
        //count  how many steps are required to generate 1 to n pages
        int step=n/2+1;
        // checking from front
        int front=Integer.MAX_VALUE;
        // checking from last
        int last=Integer.MAX_VALUE;
        int j=step;
        int i=1;
        int k=0;
        int l=0;
        while(i<=step)
        {
            int firstF=2*(i-1);
            int secondF=2*i-1;
            if(firstF==p||secondF==p)
            {
                front=(int)Math.min(front,k);
            }
            k++;
            
            
            
            int firstL=2*(j-1);
            int secondL=2*j-1;
             if(firstL==p||secondL==p)
            {
                last=(int)Math.min(last,l);
            }
            l++;
            j--;
            i++;
        }
        
        int ans=Math.min(front,last);
        return ans;

    }
