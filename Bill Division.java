public static void bonAppetit(List<Integer> bill, int k, int b) {
    // Write your code here
        int sum=0;
        for(int i=0;i<bill.size();i++)
        {
            if(i!=k)
                sum+=bill.get(i);
        }
        sum/=2;
        int dif=b-sum;
        if(dif==0)
            System.out.println("Bon Appetit");
        else{
            System.out.println(dif);
        }

    }
