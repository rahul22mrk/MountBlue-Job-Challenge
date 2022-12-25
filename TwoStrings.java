public static String twoStrings(String s1, String s2) {
  
//            for(int i=0;i<s1.length();i++)
//         {
//             String temp=""+s1.charAt(i);
//             if(s2.contains(temp))
//                 return "YES";
//         } 
        
        HashSet<Character>hs=new HashSet();
        for(int i=0;i<s1.length();i++)
        {
            hs.add(s1.charAt(i));
        }
        
        for(int i=0;i<s2.length();i++)
        {
            if(hs.contains(s2.charAt(i)))
                return "YES";
        }
       
        return "NO";

    }
