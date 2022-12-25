public static int lonelyinteger(List<Integer> a) {
    // Write your code here
        int xor=0;
        for(int i=0;i<a.size();i++)
        {
            xor=xor^a.get(i);
        }
        return xor;
    

    }
