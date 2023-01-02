//method-1 
public static String timeConversion(String s) {
    // Write your code herea
        int h1=(int)s.charAt(0)-'0';
        int h2=(int )s.charAt(1)-'0';
        int h=(h1*10+h2);
        String res="";
        if(s.charAt(8)=='A')
        {
            if(h==12)
            {
                res+="00";
                for(int i=2;i<s.length()-2;i++)
                {
                    res+=s.charAt(i);
                }
            }else{
                for(int i=0;i<s.length()-2;i++)
                {
                    res+=s.charAt(i);
                }
            }
            
        }else{
            if(h<12)
                h+=12;
            res+=h;
            for(int i=2;i<s.length()-2;i++)
            {
                res+=s.charAt(i);
            }
            
        }
        return res;
    }
