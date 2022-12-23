static int getMoneySpent(int[] keyboards, int[] drives, int b) {
     
        int sum=0;
        int res=-1;
        for(int i=0;i<keyboards.length;i++)
        {
            for(int j=0;j<drives.length;j++)
            {
                sum=keyboards[i]+drives[j];
                if(res<sum && sum<=b)
                {
                    res=sum;
                }
            }
        }
     
        return res;

    }
