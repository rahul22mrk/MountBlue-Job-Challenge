public static String gamingArray(List<Integer> arr) {
    // Write your code here
        int count  = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) > max){
                max = arr.get(i);
                count++;
            }
        }
        return (count%2==0) ? "ANDY":"BOB";

    }
