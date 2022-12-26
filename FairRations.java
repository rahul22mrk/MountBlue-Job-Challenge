public static String fairRations(List<Integer> b) {
    // Write your code here
        int odd=0;
        for(int i=b.size()-1;i>=0;i--)
        {
            if(b.get(i)%2==1)
            {
                odd++;
            }
        }
        
        if(odd%2==1)
            return "NO";
        int loaf=0;
        for(int i=b.size()-1;i>0;i--)
        {
            if(b.get(i)%2==1)
            {
                b.set(i,b.get(i)+1);
                b.set(i-1,b.get(i-1)+1);
                loaf+=2;
                
            }
        }
        String res=""+loaf;
        return res;
}
