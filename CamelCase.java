public static int camelcase(String s) {
    // Write your code here
        int cnt=1;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='A'&&ch<='Z')
                cnt++;
        }
        return cnt;

    }
