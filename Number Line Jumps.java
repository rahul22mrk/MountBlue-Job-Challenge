 public static String kangaroo(int x1, int v1, int x2, int v2) {
    // Write your code here
        
        int n=0;
        int d=x1-x2;
        int v=v2-v1;
        if(v!=0){
            n=d/v;
      
        if(n>0 && d%v==0)
        {
            return "YES";
        }
        }
        else if(x1==x2)
            return "YES";
        
        return "NO";

    }
