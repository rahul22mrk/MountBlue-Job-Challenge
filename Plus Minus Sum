
    public static void plusMinus(List<Integer> arr) {
    
        double pos=0;
        double neg=0;
        double zero=0;
        double n=arr.size();
        for(int i:arr)
        {
            if(i>0)
                pos++;
            if(i<0)
                neg++;
            if(i==0)
                zero++;
        }
        
        
        Formatter fm=new Formatter();
        fm.format("%.6f", pos/n);
        System.out.println(fm);
        
        fm=new Formatter();
        fm.format("%.6f", neg/n);
        System.out.println(fm);
        
        fm=new Formatter();
        fm.format("%.6f", zero/n);
        System.out.println(fm);

    }
