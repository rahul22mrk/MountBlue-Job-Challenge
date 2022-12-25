public static int gemstones(List<String> arr) {
    // Write your code here
        
        int cnt=0;
        for(char ch='a';ch<='z';ch++)
        {
            int temp=0;
            for(int j=0;j<arr.size();j++)
            {
                
                String s=arr.get(j);
                String t=""+ch;
                if(s.contains(t))
                {
                    temp++;
                }
            }
            if(temp==arr.size())
                cnt++;
        }
        return cnt;

    }
