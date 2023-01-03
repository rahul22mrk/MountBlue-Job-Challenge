public static int minimumNumber(int n, String password) {
    String spcl="!@#$%^&*()-+";
        Set<Character>s=new HashSet();
        for(int i=0;i<spcl.length();i++)
        {
            s.add(spcl.charAt(i));
        }
        
        boolean num=false;
        boolean upper=false;
        boolean lower=false;
        boolean spclC=false;
        
        for(int i=0;i<password.length();i++)
        {
            char ch=password.charAt(i);
            if(ch>='0'&&ch<='9')num=true;
            else if(ch>='a'&&ch<='z')lower=true;
            else if( ch>='A'&&ch<='Z')upper=true;
            else if(s.contains(ch)==true)spclC=true;
        }
        int d=0;
        if(num==true)d++;
        if(upper==true)d++;
        if(lower==true)d++;
        if(spclC==true)d++;
        int ans=(int )Math.max(6-n,4-d);
        return ans;
         
    }
