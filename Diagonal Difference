public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        int dig1=0;
        int dig2=0;
        for(int i=0;i<arr.size();i++)
        {
            for(int j=0;j<arr.size();j++){
                if(i==j)
                    dig1=dig1+arr.get(i).get(j);
                if(i+j==arr.size()-1)
                    dig2+=arr.get(i).get(j);
            }
        }
        int ans=Math.abs(dig2-dig1);
        return ans;

    }
