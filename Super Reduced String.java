public static String superReducedString(String s) {
    // Write your code here
        Stack<Character>st=new Stack();
        for(int i=0;i<s.length();i++)
        {
            if(st.size()>0 && st.peek()==s.charAt(i))
            {
                st.pop();
                
            }else{
                st.push(s.charAt(i));
            }
        }
        String res="";
        for(char ch:st)
        {
            res+=ch;
        }
        
        if(res.length()==0)
            return "Empty String";
        
        return res;

    }
