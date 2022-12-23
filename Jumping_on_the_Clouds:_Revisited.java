static int jumpingOnClouds(int[] c, int k) {
        int  res=100;
        int n=c.length;
        int flag=0;
        for(int i=0;flag!=1;i+=k)
        {
            if(c[(i+k)%n]==1){
                res=res-2-1;
                
            }else{
                res=res-1;
            }
            if((i+k)%n==0)
                {
                    flag=1;
                }
            
        }
        return res;


    }
