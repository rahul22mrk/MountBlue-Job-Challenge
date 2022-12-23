public static String angryProfessor(int k, List<Integer> a) {
      int present=0;
        for(int i=0;i<a.size();i++)
        {
            if(a.get(i)<=0)
            {
                present++;
            }
        }
        if(present<k)
            return "YES";
        return "NO";

    }
