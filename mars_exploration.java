 public static int marsExploration(String s) {
    // Write your code here
        int diff = 0;
        int n = s.length();
        int mssgNum = n/3;
        StringBuilder org = new StringBuilder();
        for(int i=0; i<mssgNum; i++){
          org.append("SOS");
       }
       org.toString();
       int i = 0;
       for(int i0; i<s.length(); i++){
           if(s.charAt(i) != org.charAt(i)){
               diff++;
           }
       } 
        return diff;

    }
