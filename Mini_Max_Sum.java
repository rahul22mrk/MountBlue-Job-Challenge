public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
        Collections.sort(arr);
        long minSum=0;
        long maxSum=0;
        for( int i=0;i<arr.size();i++)
        {
            if(i!=arr.size()-1)
                minSum+=arr.get(i);
            if(i!=0)
                maxSum+=arr.get(i);
        }
        System.out.println(minSum+ " "+maxSum);

    }
