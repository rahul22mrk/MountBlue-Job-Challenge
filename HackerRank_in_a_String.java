public static String hackerrankInString(String s) {
    // Write your code here
        s=s.toLowerCase();
        String dest="hackerrank";
        int j=0;
        int k=dest.length();
        
        for(int i=0;i<s.length();i++)
        {
            if(j<k&&s.charAt(i)==dest.charAt(j))
            {
                j++;
            }
        }
        if(j==k)
            return "YES";
        return "NO";

    }
