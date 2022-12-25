 public static String pangrams(String s) {
    // Write your code here
        s=s.toLowerCase();
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='a'&&s.charAt(i)<='z')
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(freq[i]<=0)
                return "not pangram";
            
        }
        
        return "pangram";

    }
