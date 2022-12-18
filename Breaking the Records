public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
        int min=scores.get(0);
        int cMin=0,cMax=0;
        int max=scores.get(0);
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=1;i<scores.size();i++)
        {
            if(min>scores.get(i))
            {
                min=scores.get(i);
                cMin++;
            }
            
            if(max<scores.get(i))
            {
                max=scores.get(i);
                cMax++;
            }
        }
        
        res.add(cMax);
        res.add(cMin);
        return res;
        

    }
