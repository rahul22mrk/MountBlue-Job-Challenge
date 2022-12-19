public static int hurdleRace(int k, List<Integer> height) {
    // Write your code here
        int maxE=Integer.MIN_VALUE;
        for(int i=0;i<height.size();i++)
        {
            maxE=(int)Math.max(maxE,height.get(i));
        }
        if(maxE<k)
            return 0;
        return maxE-k;

    }
