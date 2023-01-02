public static String caesarCipher(String s, int k) {
    // Write your code here
        String res="";
        for(int i=0;i<s.length();i++)
        {
           char ch=s.charAt(i);
            boolean upper=Character.isUpperCase(ch);
            if(Character.isLetter(ch))
            {
                ch+=k%26;
                if(!Character.isLetter(ch)|| (upper&& !Character.isUpperCase(ch)))
                {
                     ch-=26;
                }
            }
            
            
            res+=ch;
            
        }
        return res;

    }


///method-2

public static String caesarCipher(String s, int k) {
    // Write your code here
        String res="";
        for(int i=0;i<s.length();i++)
        {
           char ch=s.charAt(i);
            if(ch>='a'&&ch<='z')
            {
                k=k%26;
                
                 ch=(char)((int)ch+k);
                System.out.print(ch+" -> ");
                if(ch>'z')
                {
                     ch= (char)((int)ch-26);
                    
                }
                   
                 System.out.println(ch);
                res+=ch;
                
            }
            else if(ch>='A'&&ch<='Z')
            {
                k=k%26;
                
                 ch=(char)((int)ch+k);
                System.out.print(ch+" -> ");
                if(ch>'Z')
                {
                     ch= (char)((int)ch-26);
                    
                }
                   
                 System.out.println(ch);
                res+=ch;
                
            }else{
                res+=ch;
            }
        }
        return res;

    }
