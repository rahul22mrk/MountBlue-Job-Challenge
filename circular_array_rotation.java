 public static void reverse(List<Integer> a , int start , int end){
        while(start<end){
            int temp = a.get(start);
            a.set(start , a.get(end));
            a.set(end , temp);
            start++;
            end--;
        }
    }

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
    // Write your code here
        int n = a.size();
        k = k % n;
        reverse(a , 0 , n-1);
        reverse(a , 0 , k-1);
        reverse(a , k , n-1);
        
        List<Integer> res = new ArrayList<>();
        for(int i: queries){
            res.add(a.get(i));
        }
        
        return res;
    }
