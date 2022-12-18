 public static int migratoryBirds(List<Integer> arr) {
    // Write your code here\
        int freq[]=new int[6];
        for(int i:arr)
        {
            freq[i]++;
        }
        int type=0;
        int maxFreq=Integer.MIN_VALUE;
        for(int i=0;i<6;i++)
        {
            if(maxFreq<freq[i])
            {
                type=i;
                maxFreq=freq[i];
                
            }
            
        }
        return type;

    }
