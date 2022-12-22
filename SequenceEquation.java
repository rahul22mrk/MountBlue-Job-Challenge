public static List<Integer> permutationEquation(List<Integer> p) {
    // Write your code here
        ArrayList<Integer>ans=new ArrayList<>();
        ArrayList<Integer>temp=new ArrayList<>();
        
        for(int i=0;i<p.size();i++)
        {
            for(int j=0;j<p.size();j++)
            {
                if(i+1==p.get(j))
                {
                    temp.add(j);
                    break;
                }
            }
        }
        
        for(int i=0;i<temp.size();i++)
        {
            ans.add(temp.get(temp.get(i))+1);
        }
        return ans;

    }
