public static int workbook(int n, int k, List<Integer> arr) {
    // Write your code here
        int pages=0;
        int ans=0;
        int start=0;
        int end=0;
        for(int i=0;i<arr.size();i++)
        {
            start=0;
            end=0;
            do{
                pages++;
                start=end+1;
                if(arr.get(i)<k)
                {
                    end+=arr.get(i);
                }else{
                    end+=k;
                }
                if(pages>=start&&pages<=end)
                {
                    ans++;
                }
                arr.set(i,arr.get(i)-k);
            }while(arr.get(i)>0);
        
        }
      return ans;
    }
