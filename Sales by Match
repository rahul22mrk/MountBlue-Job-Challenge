public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i:ar)
            hm.put(i,hm.getOrDefault(i,0)+1);
        
        int cnt=0;
        for(int i:hm.values())
        {
            cnt+=i/2;
        }
        return cnt;

    }
